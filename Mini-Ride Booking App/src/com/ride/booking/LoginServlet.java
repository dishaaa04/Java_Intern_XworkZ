package com.ride.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

import java.sql.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ride_booking", "root", "disha1234");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                req.getSession().setAttribute("user", username);
                res.sendRedirect("index.jsp");
            } else {
                res.sendRedirect("login.jsp?error=Invalid Credentials");
            }
        } catch (Exception e) {
            e.printStackTrace();
            res.getWriter().println("ERROR: " + e.getMessage());
        }
    }
}