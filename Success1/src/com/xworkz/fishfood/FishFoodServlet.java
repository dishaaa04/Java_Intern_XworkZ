package com.xworkz.fishfood;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet(urlPatterns = "/FishFoodServlet")
public class FishFoodServlet extends GenericServlet {

    public FishFoodServlet() {
        System.out.println("Running Fish Food Servlet Constructor");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("Name");
        String brand = request.getParameter("Brand");
        String quantity = request.getParameter("Quantity");
        String cost = request.getParameter("Cost");

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body><h1 style='color:orange;'>");
        writer.println("Fish Food Details Registered Successfully for: " + name);
        writer.println("</h1></body></html>");
    }
}
