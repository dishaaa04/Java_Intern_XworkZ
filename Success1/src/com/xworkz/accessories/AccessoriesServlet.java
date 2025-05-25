package com.xworkz.accessories;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet(urlPatterns = "/AccessoriesServlet")
public class AccessoriesServlet extends GenericServlet {

    public AccessoriesServlet() {
        System.out.println("Running Accessories Servlet Constructor");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("Name");
        String type = request.getParameter("Type");
        String warranty = request.getParameter("Warranty");
        String price = request.getParameter("Price");
        String quantity = request.getParameter("Quantity");

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body><h1 style='color:purple;'>");
        writer.println("Accessories Details Registered Successfully for: " + name);
        writer.println("</h1></body></html>");
    }
}
