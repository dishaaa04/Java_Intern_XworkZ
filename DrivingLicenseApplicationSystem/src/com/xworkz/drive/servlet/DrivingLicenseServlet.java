package com.xworkz.drive.servlet;


import com.xworkz.drive.dto.DrivingLicenseDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
        import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/drivinglicense", loadOnStartup = 1)
public class DrivingLicenseServlet extends HttpServlet {
    public DrivingLicenseServlet() {
        System.out.println("Driving License Servlet Created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String mobile = req.getParameter("mobile");
        LocalDate appliedDate = LocalDate.parse(req.getParameter("appliedDate"));
        String vehicleType = req.getParameter("vehicleType");

        DrivingLicenseDTO dto = new DrivingLicenseDTO(name, address, mobile, appliedDate, vehicleType);
        System.out.println("Received Driving License Application: " + dto);

        // Generate a random license number
        String licenseNumber = "DL" + System.currentTimeMillis();

        // Display confirmation
        resp.setContentType("text/html");
        resp.getWriter().println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
        resp.getWriter().println("<div class='container mt-5'><h3 class='text-success'>Driving License Application Submitted Successfully!</h3>");
        resp.getWriter().println("<div class='card mt-4'>");
        resp.getWriter().println("<div class='card-header bg-primary text-white'>Application Summary</div>");
        resp.getWriter().println("<div class='card-body'>");
        resp.getWriter().println("<p><strong>Application Number:</strong> " + licenseNumber + "</p>");
        resp.getWriter().println("<p><strong>Applicant Name:</strong> " + dto.getName() + "</p>");
        resp.getWriter().println("<p><strong>Vehicle Type:</strong> " + dto.getVehicleType() + "</p>");
        resp.getWriter().println("<p class='text-warning mt-3'>Note: Please save this application number for future reference.</p>");
        resp.getWriter().println("</div></div></div>");
    }
}