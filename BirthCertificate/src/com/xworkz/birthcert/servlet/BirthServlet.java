package com.xworkz.birthcert.servlet;



import com.xworkz.birthcert.dto.BirthDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
        import java.io.IOException;

@WebServlet(urlPatterns = "/birth", loadOnStartup = 1)
public class BirthServlet extends HttpServlet {

    public BirthServlet() {
        System.out.println("BirthServlet created...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String birthId = req.getParameter("birthId");
        String hospitalName = req.getParameter("hospitalName");
        String fatherName = req.getParameter("fatherName");
        String motherName = req.getParameter("motherName");
        String birthDateTime = req.getParameter("birthDateTime");
        String doctorName = req.getParameter("doctorName");
        String nurseName = req.getParameter("nurseName");
        String hospitalType = req.getParameter("hospitalType");

        BirthDTO dto = new BirthDTO(birthId, hospitalName, fatherName, motherName,
                birthDateTime, doctorName, nurseName, hospitalType);
        System.out.println("Received Birth Registration: " + dto);

        resp.setContentType("text/html");
        resp.getWriter().println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
        resp.getWriter().println("<div class='container mt-5'><h3 class='text-success'>Birth Registered Successfully!</h3>");
        resp.getWriter().println("<p><strong>Birth ID:</strong> " + dto.getBirthId() + "</p>");
        resp.getWriter().println("<p><strong>Father:</strong> " + dto.getFatherName() + "</p>");
        resp.getWriter().println("<p><strong>Mother:</strong> " + dto.getMotherName() + "</p>");
        resp.getWriter().println("<p><strong>Hospital:</strong> " + dto.getHospitalName() + "</p></div>");
    }
}

