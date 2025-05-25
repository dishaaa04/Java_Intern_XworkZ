package com.xworkz.plant;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet(urlPatterns = "/PlantServlet")
public class PlantServlet extends GenericServlet {

    public PlantServlet() {
        System.out.println("Running Plant Servlet Constructor");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("Name");
        String cost = request.getParameter("Cost");
        String type = request.getParameter("Type");
        String soilType = request.getParameter("SoilType");

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body><h1 style='color:brown;'>");
        writer.println("Plant Details Registered Successfully for: " + name);
        writer.println("</h1></body></html>");
    }
}
