package com.xworkz.staticapp.servlet;



import com.xworkz.staticapp.dto.DeathCertificateDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
        import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

@WebServlet(urlPatterns = "/deathcertificate", loadOnStartup = 1)
public class DeathCertificateServlet extends HttpServlet {
    public DeathCertificateServlet() {
        System.out.println("Death Certificate Servlet Created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String cause = req.getParameter("cause");
        LocalDate date = LocalDate.parse(req.getParameter("date"));
        LocalTime time = LocalTime.parse(req.getParameter("time"));
        int ageAtDeath = Integer.parseInt(req.getParameter("ageAtDeath"));
        String certifiedBy = req.getParameter("certifiedBy");
        String hospitalName = req.getParameter("hospitalName");
        String mannerOfDeath = req.getParameter("mannerOfDeath");
        String gender = req.getParameter("gender");
        String marks = req.getParameter("marks");

        DeathCertificateDTO dto = new DeathCertificateDTO(name, cause, date, time,
                ageAtDeath, certifiedBy, hospitalName,
                mannerOfDeath, gender, marks);
        System.out.println("Received Death Certificate Application: " + dto);

        // Display confirmation
        resp.setContentType("text/html");
        resp.getWriter().println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
        resp.getWriter().println("<div class='container mt-5'><h3 class='text-success'>Death Certificate Registered Successfully!</h3>");
        resp.getWriter().println("<p><strong>Deceased Name:</strong> " + dto.getName() + "</p>");
        resp.getWriter().println("<p><strong>Certificate Number:</strong> DC-" + System.currentTimeMillis() + "</p>");
        resp.getWriter().println("<p class='text-warning'>Note: Please save this certificate number for future reference.</p></div>");
    }
}