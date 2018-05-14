package Models;
import org.json.JSONArray;
public class HotelOfferModel {
    private JSONArray travelStartDate;
    private JSONArray travelEndDate;
    private Integer lengthOfStay;
    private String regionID;
    private String longName;
    private String shortName;
    private String country;
    private String province;
    private String city;
    private String nonLocalizedCity;
    private String hotelCity ;
    private String hotelCountryCode;
    private String hotelDestination;
    private String hotelDestinationRegionID;
    private Double hotelGuestReviewRating;
    private String hotelId;
    private String hotelImageUrl;
    private String hotelLongDestination;
    private String hotelName;
    private String hotelProvince;
    private Integer hotelReviewTotal;
    private Double hotelStarRating;
    private String hotelStreetAddress;
    private boolean isOfficialRating;
    private String localizedHotelName;
    private boolean vipAccess;
    private String currency;
    private Double averagePriceValue;
    private Double crossOutPriceValue;
    private Double originalPricePerNight;
    private Double totalPriceValue;
    private Integer percentSavings;
    private boolean drr;
    private String hotelInfositeUrl;
    private String hotelSearchResultUrl;

    public JSONArray getTravelStartDate() {
        return travelStartDate;
    }

    public void setTravelStartDate(JSONArray travelStartDate) {
        if(! travelStartDate.equals(null))
            this.travelStartDate = travelStartDate;
    }

    public JSONArray getTravelEndDate() {
        return travelEndDate;
    }

    public void setTravelEndDate(JSONArray travelEndDate) {
        if(! travelEndDate.equals(null))
            this.travelEndDate = travelEndDate;
    }

    public Integer getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(Integer lengthOfStay) {
        if(! lengthOfStay.equals(null))
            this.lengthOfStay = lengthOfStay;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        if(! regionID.equals(null))
            this.regionID = regionID;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        if(! longName.equals(null))
            this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        if(! shortName.equals(null))
            this.shortName = shortName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(! country.equals(null))
            this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        if(!province.equals(null))
            this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(! city.equals(null))
            this.city = city;
    }

    public String getNonLocalizedCity() {
        return nonLocalizedCity;
    }

    public void setNonLocalizedCity(String nonLocalizedCity) {
        if(! nonLocalizedCity.equals(null))
            this.nonLocalizedCity = nonLocalizedCity;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        if(! hotelCity.equals(null))
            this.hotelCity = hotelCity;
    }

    public String getHotelCountryCode() {
        return hotelCountryCode;
    }

    public void setHotelCountryCode(String hotelCountryCode) {
        if(! hotelCountryCode.equals(null))
            this.hotelCountryCode = hotelCountryCode;
    }

    public String getHotelDestination() {
        return hotelDestination;
    }

    public void setHotelDestination(String hotelDestination) {
        if(! hotelDestination.equals(null))
            this.hotelDestination = hotelDestination;
    }

    public String getHotelDestinationRegionID() {
        return hotelDestinationRegionID;
    }

    public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
        if(! hotelDestinationRegionID.equals(null))
            this.hotelDestinationRegionID = hotelDestinationRegionID;
    }

    public Double getHotelGuestReviewRating() {
        return hotelGuestReviewRating;
    }

    public void setHotelGuestReviewRating(Double hotelGuestReviewRating) {
        if(! hotelGuestReviewRating.equals(null))
            this.hotelGuestReviewRating = hotelGuestReviewRating;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        if(! hotelId.equals(null))
            this.hotelId = hotelId;
    }

    public String getHotelImageUrl() {
        return hotelImageUrl;
    }

    public void setHotelImageUrl(String hotelImageUrl) {
        if(! hotelImageUrl.equals(null))
            this.hotelImageUrl = hotelImageUrl;
    }

    public String getHotelLongDestination() {
        return hotelLongDestination;
    }

    public void setHotelLongDestination(String hotelLongDestination) {
        if(! hotelLongDestination.equals(null))
            this.hotelLongDestination = hotelLongDestination;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        if(! hotelName.equals(null))
            this.hotelName = hotelName;
    }

    public String getHotelProvince() {
        return hotelProvince;
    }

    public void setHotelProvince(String hotelProvince) {
        if(! hotelProvince.equals(null))
            this.hotelProvince = hotelProvince;
    }

    public Integer getHotelReviewTotal() {
        return hotelReviewTotal;
    }

    public void setHotelReviewTotal(Integer hotelReviewTotal) {
        if(! hotelReviewTotal.equals(null))
            this.hotelReviewTotal = hotelReviewTotal;
    }

    public Double getHotelStarRating() {
        return hotelStarRating;
    }

    public void setHotelStarRating(Double hotelStarRating) {
        if(! hotelStarRating.equals(null))
            this.hotelStarRating = hotelStarRating;
    }

    public String getHotelStreetAddress() {
        return hotelStreetAddress;
    }

    public void setHotelStreetAddress(String hotelStreetAddress) {
        if(! hotelStreetAddress.equals(null))
            this.hotelStreetAddress = hotelStreetAddress;
    }

    public boolean isOfficialRating() {
        return isOfficialRating;
    }

    public void setOfficialRating(boolean officialRating) {
        isOfficialRating = officialRating;
    }

    public String getLocalizedHotelName() {
        return localizedHotelName;
    }

    public void setLocalizedHotelName(String localizedHotelName) {
        if(! localizedHotelName.equals(null))
            this.localizedHotelName = localizedHotelName;
    }

    public boolean isVipAccess() {
        return vipAccess;
    }

    public void setVipAccess(boolean vipAccess) {
        this.vipAccess = vipAccess;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        if(! currency.equals(null))
            this.currency = currency;
    }

    public Double getAveragePriceValue() {
        return averagePriceValue;
    }

    public void setAveragePriceValue(Double averagePriceValue) {
        if(! averagePriceValue.equals(null))
            this.averagePriceValue = averagePriceValue;
    }

    public Double getCrossOutPriceValue() {
        return crossOutPriceValue;
    }

    public void setCrossOutPriceValue(Double crossOutPriceValue) {
        if(! crossOutPriceValue.equals(null))
            this.crossOutPriceValue = crossOutPriceValue;
    }

    public Double getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    public void setOriginalPricePerNight(Double originalPricePerNight) {
        if(! originalPricePerNight.equals(null))
            this.originalPricePerNight = originalPricePerNight;
    }

    public Double getTotalPriceValue() {
        return totalPriceValue;
    }

    public void setTotalPriceValue(Double totalPriceValue) {
        if(! totalPriceValue.equals(null))
            this.totalPriceValue = totalPriceValue;
    }

    public Integer getPercentSavings() {
        return percentSavings;
    }

    public void setPercentSavings(Integer percentSavings) {
        if(! percentSavings.equals(null))
            this.percentSavings = percentSavings;
    }

    public boolean isDrr() {
        return drr;
    }

    public void setDrr(boolean drr) {
        this.drr = drr;
    }

    public String getHotelInfositeUrl() {
        return hotelInfositeUrl;
    }

    public void setHotelInfositeUrl(String hotelInfositeUrl) {
        if(! hotelInfositeUrl.equals(null))
            this.hotelInfositeUrl = hotelInfositeUrl;
    }

    public String getHotelSearchResultUrl() {
        return hotelSearchResultUrl;
    }

    public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
        if(! hotelSearchResultUrl.equals(null))
            this.hotelSearchResultUrl = hotelSearchResultUrl;
    }

    @Override
    public String toString() {
        return "HotelDeal{" +
                "travelStartDate=" + travelStartDate +
                ", travelEndDate=" + travelEndDate +
                ", lengthOfStay=" + lengthOfStay +
                ", regionID='" + regionID + '\'' +
                ", longName='" + longName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", nonLocalizedCity='" + nonLocalizedCity + '\'' +
                ", hotelCity='" + hotelCity + '\'' +
                ", hotelCountryCode='" + hotelCountryCode + '\'' +
                ", hotelDestination='" + hotelDestination + '\'' +
                ", hotelDestinationRegionID='" + hotelDestinationRegionID + '\'' +
                ", hotelGuestReviewRating='" + hotelGuestReviewRating + '\'' +
                ", hotelId='" + hotelId + '\'' +
                ", hotelImageUrl='" + hotelImageUrl + '\'' +
                ", hotelLongDestination='" + hotelLongDestination + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", hotelProvince='" + hotelProvince + '\'' +
                ", hotelReviewTotal=" + hotelReviewTotal +
                ", hotelStarRating='" + hotelStarRating + '\'' +
                ", hotelStreetAddress='" + hotelStreetAddress + '\'' +
                ", isOfficialRating=" + isOfficialRating +
                ", localizedHotelName='" + localizedHotelName + '\'' +
                ", vipAccess=" + vipAccess +
                ", currency='" + currency + '\'' +
                ", averagePriceValue=" + averagePriceValue +
                ", crossOutPriceValue=" + crossOutPriceValue +
                ", originalPricePerNight=" + originalPricePerNight +
                ", totalPriceValue=" + totalPriceValue +
                ", percentSavings=" + percentSavings +
                ", drr=" + drr +
                ", hotelInfositeUrl='" + hotelInfositeUrl + '\'' +
                ", hotelSearchResultUrl='" + hotelSearchResultUrl + '\'' +
                '}';
    }
}
