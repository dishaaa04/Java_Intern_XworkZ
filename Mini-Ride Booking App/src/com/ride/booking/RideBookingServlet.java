package com.ride.booking;

import java.io.IOException;
import java.sql.*;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bookRide")
public class RideBookingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ride_booking";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "disha1234";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String customerName = request.getParameter("customerName");
        String pickupLocation = request.getParameter("pickupLocation");
        String dropoffLocation = request.getParameter("dropoffLocation");

        if (customerName == null || pickupLocation == null || dropoffLocation == null ||
                customerName.isEmpty() || pickupLocation.isEmpty() || dropoffLocation.isEmpty()) {
            response.sendRedirect("index.jsp?error=All fields are required");
            return;
        }

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int bookingId = 0;
        int fare = 100 + new Random().nextInt(201);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            String sql = "INSERT INTO bookings (customer_name, pickup_location, dropoff_location, fare) VALUES (?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, customerName);
            stmt.setString(2, pickupLocation);
            stmt.setString(3, dropoffLocation);
            stmt.setInt(4, fare);
            stmt.executeUpdate();

            rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                bookingId = rs.getInt(1);
            }

            request.setAttribute("customerName", customerName);
            request.setAttribute("pickupLocation", pickupLocation);
            request.setAttribute("dropoffLocation", dropoffLocation);
            request.setAttribute("bookingId", bookingId);
            request.setAttribute("fare", fare);
            request.getRequestDispatcher("success.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("ERROR: " + e.getMessage());;
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}