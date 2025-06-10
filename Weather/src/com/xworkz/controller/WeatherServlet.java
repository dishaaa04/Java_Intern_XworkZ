package com.xworkz.controller;

import com.xworkz.dto.WeatherDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/weather")
public class WeatherServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        // Get parameters from request
        String location = request.getParameter("location");
        String capturedBy = request.getParameter("capturedBy");
        String temperature = request.getParameter("temperature");
        String recordedDate = request.getParameter("recordedDate");

        // Create DTO object
        WeatherDTO weather = new WeatherDTO(location, capturedBy, temperature, recordedDate);

        // Set DTO in request scope
        request.setAttribute("weather", weather);

        // Forward to result JSP
        RequestDispatcher rd = request.getRequestDispatcher("WeatherResult.jsp");
        rd.forward(request, response);
    }
}
