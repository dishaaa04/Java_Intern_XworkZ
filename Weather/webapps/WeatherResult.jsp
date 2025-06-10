<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.xworkz.dto.WeatherDTO" %>
<%
WeatherDTO weather = (WeatherDTO) request.getAttribute("weather");
%>

<html>
<head>
    <meta charset="UTF-8">
    <title>Weather Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light py-5">
<div class="container text-center">
    <h2 class="mb-4 text-success">✅ Weather Data Recorded</h2>
    <div class="card shadow-sm mx-auto" style="max-width: 500px;">
        <div class="card-body">
            <h5 class="card-title">📍 Location: <span class="text-primary"><%= weather.getLocation() %></span></h5>
            <p class="card-text">Captured By: <strong><%= weather.getCapturedBy() %></strong></p>
            <p class="card-text">Temperature: <strong><%= weather.getTemperature() %></strong></p>
            <p class="card-text">Recorded Date: <strong><%= weather.getRecordedDate() %></strong></p>
            <a href="Weather.jsp" class="btn btn-outline-primary mt-3">Add Another Record</a>
        </div>
    </div>
</div>
</body>
</html>
