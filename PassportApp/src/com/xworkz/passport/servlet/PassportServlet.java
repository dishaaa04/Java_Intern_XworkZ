package com.xworkz.passport.servlet;

import com.xworkz.passport.dto.PassportDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
        import java.io.IOException;

@WebServlet(urlPatterns = "/passport", loadOnStartup = 1)
public class PassportServlet extends HttpServlet {
    public PassportServlet() {
        System.out.println("Passport Servlet Created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String applicantName = req.getParameter("applicantName");
        String aadharNo = req.getParameter("aadharNo");
        String address = req.getParameter("address");
        String panNo = req.getParameter("panNo");
        String country = req.getParameter("country");
        String state = req.getParameter("state");
        String city = req.getParameter("city");
        String pinCode = req.getParameter("pinCode");
        String passportType = req.getParameter("passportType");
        String paymentReferenceNo = req.getParameter("paymentReferenceNo");

        PassportDTO dto = new PassportDTO(applicantName, aadharNo, address, panNo,
                country, state, city, pinCode,
                passportType, paymentReferenceNo);
        System.out.println("Received Passport Application: " + dto);

        // Display confirmation
        resp.setContentType("text/html");
        resp.getWriter().println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
        resp.getWriter().println("<div class='container mt-5'><h3 class='text-success'>Passport Application Submitted Successfully!</h3>");
        resp.getWriter().println("<p><strong>Applicant Name:</strong> " + dto.getApplicantName() + "</p>");
        resp.getWriter().println("<p><strong>Application Reference:</strong> " + dto.getPaymentReferenceNo() + "</p>");
        resp.getWriter().println("<p class='text-warning'>Note: Please save this reference number for future communication.</p></div>");
    }
}