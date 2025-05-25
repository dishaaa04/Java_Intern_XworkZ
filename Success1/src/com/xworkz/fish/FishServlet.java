package com.xworkz.fish;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet(urlPatterns = "/FishServlet")
public class FishServlet extends GenericServlet {

    public FishServlet() {
        System.out.println("Running Fish Servlet Constructor");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("Name");
        String color = request.getParameter("Color");
        String lifeSpan = request.getParameter("LifeSpan");
        String cost = request.getParameter("Cost");
        String type = request.getParameter("Type");
        String size = request.getParameter("Size");

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body><h1 style='color:blue;'>");
        writer.println("Fish Details Registered Successfully for: " + name);
        writer.println("</h1></body></html>");
    }
}
