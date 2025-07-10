package com.ride.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

@WebServlet("/cancelRide")
public class CancelRideServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int bookingId = Integer.parseInt(req.getParameter("bookingId"));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ride_booking", "root", "disha1234");
            PreparedStatement ps = con.prepareStatement("UPDATE bookings SET status='Cancelled' WHERE id=?");
            ps.setInt(1, bookingId);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) { e.printStackTrace(); }
        res.sendRedirect("history.jsp");
    }
}