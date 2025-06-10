package com.xworkz.general.servlet;

import com.xworkz.general.dto.JobDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/job", loadOnStartup = 1)
public class JobServlet extends HttpServlet {
    public JobServlet() {
        System.out.println("Servlet Created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String education = req.getParameter("education");
        String skills = req.getParameter("skills");
        String expectedSalaryStr = req.getParameter("expectedSalary");
        String experience = req.getParameter("experience");

        double expectedSalary = 0;
        try {
            expectedSalary = Double.parseDouble(expectedSalaryStr);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        JobDTO dto = new JobDTO(name, email, education, skills, expectedSalary, experience);
        System.out.println("Received Job Application: " + dto);

        // Display confirmation
        resp.setContentType("text/html");
        resp.getWriter().println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
        resp.getWriter().println("<div class='container mt-5'><h3 class='text-success'>Application Submitted Successfully!</h3>");
        resp.getWriter().println("<p><strong>Name:</strong> " + dto.getName() + "</p>");
        resp.getWriter().println("<p><strong>Email:</strong> " + dto.getEmail() + "</p></div>");
    }
}