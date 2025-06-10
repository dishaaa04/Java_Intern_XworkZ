package com.xworkz.cert.servlet;

import com.xworkz.cert.dto.MarriageCertificateDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/marriagecertificate", loadOnStartup = 1)
public class MarriageCertificateServlet extends HttpServlet {
    public MarriageCertificateServlet() {
        System.out.println("Marriage Certificate Servlet Created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String groomName = req.getParameter("groomName");
        String brideName = req.getParameter("brideName");
        String location = req.getParameter("location");
        String address = req.getParameter("address");
        String religion = req.getParameter("religion");
        LocalDate date = LocalDate.parse(req.getParameter("date"));
        String witness1 = req.getParameter("witness1");
        String witness2 = req.getParameter("witness2");
        String officerPresent = req.getParameter("officerPresent");

        MarriageCertificateDTO dto = new MarriageCertificateDTO(groomName, brideName, location,
                address, religion, date,
                witness1, witness2, officerPresent);
        System.out.println("Received Marriage Certificate Application: " + dto);

        // Generate certificate number
        String certificateNumber = "MC-" + System.currentTimeMillis();

        // Display confirmation
        resp.setContentType("text/html");
        resp.getWriter().println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
        resp.getWriter().println("<div class='container mt-5'><h3 class='text-success'>Marriage Certificate Registered Successfully!</h3>");
        resp.getWriter().println("<div class='card mt-4'>");
        resp.getWriter().println("<div class='card-header bg-primary text-white'>Certificate Details</div>");
        resp.getWriter().println("<div class='card-body'>");
        resp.getWriter().println("<p><strong>Certificate Number:</strong> " + certificateNumber + "</p>");
        resp.getWriter().println("<p><strong>Groom:</strong> " + dto.getGroomName() + "</p>");
        resp.getWriter().println("<p><strong>Bride:</strong> " + dto.getBrideName() + "</p>");
        resp.getWriter().println("<p><strong>Date of Marriage:</strong> " + dto.getDate() + "</p>");
        resp.getWriter().println("<p class='text-warning mt-3'>Note: Please save this certificate number for future reference.</p>");
        resp.getWriter().println("</div></div></div>");
    }
}