package com.xworkz.aquarium;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet(urlPatterns = "/AquariumServlet")
public class AquariumServlet extends GenericServlet {

    public AquariumServlet() {
        System.out.println("Running Aquarium Servlet Constructor");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Processing Aquarium Form");

        String model = request.getParameter("Model");
        String cost = request.getParameter("Cost");
        String size = request.getParameter("Size");
        String company = request.getParameter("Company");
        String capacity = request.getParameter("Capacity");

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body><h1 style='color:green;'>");
        writer.println("Aquarium Details Registered Successfully for Model: " + model);
        writer.println("</h1></body></html>");
    }
}
