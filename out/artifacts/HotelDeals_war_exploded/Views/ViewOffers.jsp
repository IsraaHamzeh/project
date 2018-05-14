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

<c:forEach items="${requestScope.hotelDeals}" var="deal" varStatus="status">
    <img src="${deal.getHotelImageUrl()}" class="img-thumbnail center-block" alt="Blog Post Thumbnail">
    <p>${deal.getHotelName()} </p>
    <p>${deal.getHotelLongDestination()}</p>

</c:forEach>

<% request.setAttribute("country", null); %>


</body>
</html>
