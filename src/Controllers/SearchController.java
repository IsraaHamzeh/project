package Controllers;
import Models.HotelOfferModel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;
import org.json.JSONObject;
import org.json.JSONArray;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class SearchController implements Controller {

    @Override
    public String handleRequest(HttpServletRequest request,
                                HttpServletResponse response) {
        HttpSession session = request.getSession();
        if (!session.equals(null)) {
            String USER_AGENT = "Mozilla/5.0";
            String urlStr = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

            String _country = (String) request.getParameter("country");
            if (!_country.equals("-1"))
                urlStr = urlStr + "&country=" + _country;

            String minTripStartDate = (String) request.getParameter("minTripStartDate");
            if (!minTripStartDate.equals(""))
                urlStr = urlStr + "&minTripStartDate=" + minTripStartDate;

            String maxTripStartDate = (String) request.getParameter("maxTripStartDate");
            if (!maxTripStartDate.equals(""))
                urlStr = urlStr + "&maxTripStartDate=" + maxTripStartDate;

            String _lengthOfStay = (String) request.getParameter("lengthOfStay");
            if (!_lengthOfStay.equals(""))
                urlStr = urlStr + "&lengthOfStay=" + Integer.valueOf(_lengthOfStay);

            String maxStarRating = (String) request.getParameter("maxStarRating");
            if (!maxStarRating.equals(""))
                urlStr = urlStr + "&maxStarRating=" + Double.valueOf(maxStarRating);

            String minStarRating = (String) request.getParameter("minStarRating");
            if (!minStarRating.equals(""))
                urlStr = urlStr + "&minStarRating=" + Double.valueOf(minStarRating);

            String maxTotalRate = (String) request.getParameter("maxTotalRate");
            if (!maxTotalRate.equals(""))
                urlStr = urlStr + "&maxTotalRate=" + Integer.valueOf(maxTotalRate);

            String minTotalRate = (String) request.getParameter("minTotalRate");
            if (!minTotalRate.equals(""))
                urlStr = urlStr + "&minTotalRate=" + Integer.valueOf(minTotalRate);

            String maxGuestRating = (String) request.getParameter("maxGuestRating");
            if (!maxGuestRating.equals(""))
                urlStr = urlStr + "&maxGuestRating=" + Integer.valueOf(maxGuestRating);

            String minGuestRating = (String) request.getParameter("minGuestRating");
            if (!minGuestRating.equals(""))
                urlStr = urlStr + "&minGuestRating=" + Integer.valueOf(minGuestRating);

            System.out.println(urlStr);
            try {
                URL url = new URL(urlStr);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                con.setRequestProperty("User-Agent", USER_AGENT);
                int responseCode = con.getResponseCode();

                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer apiResponse = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    apiResponse.append(inputLine);
                }
                in.close();

                org.json.JSONObject myResponse = new org.json.JSONObject(apiResponse.toString());
                org.json.JSONObject offers = myResponse.getJSONObject("offers");
                org.json.JSONArray jArr = offers.getJSONArray("Hotel");
                int length = jArr.length();
                List<HotelOfferModel> hotelDeals = new ArrayList<>();

                //Declare Objects
                String hotelDestinationRegionID;
                JSONArray travelStartDate;
                JSONArray travelEndDate;
                Integer lengthOfStay;
                String regionID;
                String longName;
                String shortName;
                String country;
                String province;
                String city;
                String nonLocalizedCity;
                String hotelCity;
                String hotelCountryCode;
                String hotelDestination;
                Double hotelGuestReviewRating;
                String hotelId;
                String hotelImageUrl;
                String hotelName;
                String hotelProvince;
                Integer hotelReviewTotal;
                Double hotelStarRating;
                String hotelStreetAddress;
                String localizedHotelName;
                String hotelLongDestination;
                boolean isOfficialRating;
                boolean vipAccess;
                String currency;
                Double averagePriceValue;
                Double crossOutPriceValue;
                Double originalPricePerNight;
                Double totalPriceValue;
                Integer percentSavings;
                boolean drr;
                //String hotelInfositeUrl;
                //String hotelSearchResultUrl;
                //JSONObject destination;
                //JSONObject hotelInfo;
               // JSONObject hotelPricingInfo;
               // JSONObject hotelUrls;

                for (int i = 0; i < length; i++) {
                    HotelOfferModel deal = new HotelOfferModel();
                    JSONObject offer = jArr.getJSONObject(i);
                    JSONObject offerDateRange = offer.getJSONObject("offerDateRange");
                    if (offerDateRange.has("travelStartDate")) {
                        travelStartDate = offerDateRange.getJSONArray("travelStartDate");
                        deal.setTravelStartDate(travelStartDate);
                    }
                    if (offerDateRange.has("travelEndDate")) {
                        travelEndDate = offerDateRange.getJSONArray("travelEndDate");
                        deal.setTravelEndDate(travelEndDate);
                    }
                    if (offerDateRange.has("lengthOfStay")) {
                        lengthOfStay = offerDateRange.getInt("lengthOfStay");
                        deal.setLengthOfStay(lengthOfStay);
                    }

                    JSONObject destination = offer.getJSONObject("destination");
                    if (destination.has("regionID")) {
                        regionID = destination.getString("regionID");
                        deal.setRegionID(regionID);
                    }
                    if (destination.has("longName")) {
                        longName = destination.getString("longName");
                        deal.setLongName(longName);
                    }
                    if (destination.has("shortName")) {
                        shortName = destination.getString("shortName");
                        deal.setShortName(shortName);
                    }
                    if (destination.has("country")) {
                        country = destination.getString("country");
                        deal.setCountry(country);
                    }
                    if (destination.has("province")) {
                        province = destination.getString("province");
                        deal.setProvince(province);
                    }
                    if (destination.has("city")) {
                        city = destination.getString("city");
                        deal.setCity(city);
                    }
                    if (destination.has("nonLocalizedCity")) {
                        nonLocalizedCity = destination.getString("nonLocalizedCity");
                        deal.setNonLocalizedCity(nonLocalizedCity);
                    }


                    JSONObject hotelInfo = offer.getJSONObject("hotelInfo");
                    if (hotelInfo.has("hotelCity")) {
                        hotelCity = hotelInfo.getString("hotelCity");
                        deal.setHotelCity(hotelCity);
                    }
                    if (hotelInfo.has("hotelCountryCode")) {
                        hotelCountryCode = hotelInfo.getString("hotelCountryCode");
                        deal.setHotelCountryCode(hotelCountryCode);
                    }
                    if (hotelInfo.has("hotelDestination")) {
                        hotelDestination = hotelInfo.getString("hotelDestination");
                        deal.setHotelDestination(hotelDestination);
                    }
                    if (hotelInfo.has("hotelDestinationRegionID")) {
                        hotelDestinationRegionID = hotelInfo.getString("hotelDestinationRegionID");
                        deal.setHotelDestinationRegionID(hotelDestinationRegionID);
                    }
                    if (hotelInfo.has("hotelGuestReviewRating")) {
                        hotelGuestReviewRating = hotelInfo.getDouble("hotelGuestReviewRating");
                        deal.setHotelGuestReviewRating(hotelGuestReviewRating);
                    }
                    if (hotelInfo.has("hotelId")) {
                        hotelId = hotelInfo.getString("hotelId");
                        deal.setHotelId(hotelId);
                    }
                    if (hotelInfo.has("hotelImageUrl")) {
                        hotelImageUrl = hotelInfo.getString("hotelImageUrl");
                        deal.setHotelImageUrl(hotelImageUrl);
                    }
                    if (hotelInfo.has("hotelLongDestination")) {
                        hotelLongDestination = hotelInfo.getString("hotelLongDestination");
                        deal.setHotelLongDestination(hotelLongDestination);
                    }
                    if (hotelInfo.has("hotelName")) {
                        hotelName = hotelInfo.getString("hotelName");
                        deal.setHotelName(hotelName);
                    }
                    if (hotelInfo.has("hotelProvince")) {
                        hotelProvince = hotelInfo.getString("hotelProvince");
                        deal.setHotelProvince(hotelProvince);
                    }
                    if (hotelInfo.has("hotelReviewTotal")) {
                        hotelReviewTotal = hotelInfo.getInt("hotelReviewTotal");
                        deal.setHotelReviewTotal(hotelReviewTotal);
                    }
                    if (hotelInfo.has("hotelStarRating")) {
                        hotelStarRating = hotelInfo.getDouble("hotelStarRating");
                        deal.setHotelStarRating(hotelStarRating);
                    }
                    if (hotelInfo.has("hotelStreetAddress")) {
                        hotelStreetAddress = hotelInfo.getString("hotelStreetAddress");
                        deal.setHotelStreetAddress(hotelStreetAddress);
                    }
                    if (hotelInfo.has("isOfficialRating")) {
                        isOfficialRating = hotelInfo.getBoolean("isOfficialRating");
                        deal.setOfficialRating(isOfficialRating);
                    }
                    if (hotelInfo.has("localizedHotelName")) {
                        localizedHotelName = hotelInfo.getString("localizedHotelName");
                        deal.setLocalizedHotelName(localizedHotelName);
                    }
                    if (hotelInfo.has("vipAccess")) {
                        vipAccess = hotelInfo.getBoolean("vipAccess");
                        deal.setVipAccess(vipAccess);
                    }

                    JSONObject hotelPricingInfo = offer.getJSONObject("hotelPricingInfo");
                    if (hotelPricingInfo.has("currency")) {
                        currency = hotelPricingInfo.getString("currency");
                        deal.setCurrency(currency);
                    }
                    if (hotelPricingInfo.has("averagePriceValue")) {
                        averagePriceValue = hotelPricingInfo.getDouble("averagePriceValue");
                        deal.setAveragePriceValue(averagePriceValue);
                    }
                    if (hotelPricingInfo.has("crossOutPriceValue")) {
                        crossOutPriceValue = hotelPricingInfo.getDouble("crossOutPriceValue");
                        deal.setCrossOutPriceValue(crossOutPriceValue);
                    }
                    if (hotelPricingInfo.has("originalPricePerNight")) {
                        originalPricePerNight = hotelPricingInfo.getDouble("originalPricePerNight");
                        deal.setOriginalPricePerNight(originalPricePerNight);
                    }
                    if (hotelPricingInfo.has("totalPriceValue")) {
                        totalPriceValue = hotelPricingInfo.getDouble("totalPriceValue");
                        deal.setTotalPriceValue(totalPriceValue);
                    }
                    if (hotelPricingInfo.has("percentSavings")) {
                        percentSavings = hotelPricingInfo.getInt("percentSavings");
                        deal.setPercentSavings(percentSavings);
                    }
                    if (hotelPricingInfo.has("drr")) {
                        drr = hotelPricingInfo.getBoolean("drr");
                        deal.setDrr(drr);
                    }

                    JSONObject hotelUrls = offer.getJSONObject("hotelUrls");
                    if (hotelUrls.has(" hotelInfositeUrl")) {
                        String hotelInfositeUrl = hotelUrls.getString("hotelInfositeUrl");
                        deal.setHotelInfositeUrl(hotelInfositeUrl);
                    }
                    if (hotelUrls.has("hotelSearchResultUrl")) {
                        String hotelSearchResultUrl = hotelUrls.getString("hotelSearchResultUrl");
                        deal.setHotelSearchResultUrl(hotelSearchResultUrl);
                    }

                    hotelDeals.add(deal);
                    //System.out.println(deal.toString());
                }

                request.setAttribute("hotelDeals", hotelDeals);

            } catch (Exception e) {
                e.printStackTrace();
            }
            return "ViewOffers.jsp";
        }
        return "SearchForm.jsp";

    }
}
