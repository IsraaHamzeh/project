<%--
  Created by IntelliJ IDEA.
  User: iabedulnabi
  Date: 5/12/18
  Time: 12:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Hotel Deals</title>
</head>
<body>
<div align="center">
    <img src="/images/exp3.jpg" alt="Expedia inc">
</div>
</br>
<div align="center">
<c:forEach items="${requestScope.hotelDeals}" var="deal" varStatus="status">
    <img src="${deal.getHotelImageUrl()}" class="img-thumbnail center-block" alt="Blog Post Thumbnail">
    <p>${deal.getHotelName()} </p>
    <p>${deal.getHotelLongDestination()}</p>
    <p>${deal.getOriginalPricePerNight()} ${deal.getCurrency()} Per Night</p>

</c:forEach>
    <input type="button" name="Search" value="Search" onclick="location.href='SearchForm.jsp';" class="submit_button" id="SSsubmit" /></div></div>

</div>
</body>
</html>
