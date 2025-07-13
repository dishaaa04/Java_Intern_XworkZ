<%@ page import="java.sql.*" %>
<% if (session.getAttribute("user") == null) { response.sendRedirect("login.jsp"); return; } %>
<!DOCTYPE html>
<html>
<head><title>Ride History</title></head>
<body>
<h2>Ride History</h2>
<table border="1">
    <tr><th>ID</th><th>Name</th><th>Pickup</th><th>Drop</th><th>Fare</th><th>Status</th><th>Time</th><th>Action</th></tr>
    <%
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ride_booking", "root", " ");
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM bookings ORDER BY ride_time DESC");
    while(rs.next()) {
    %>
    <tr>
        <td><%= rs.getInt("id") %></td>
        <td><%= rs.getString("customer_name") %></td>
        <td><%= rs.getString("pickup_location") %></td>
        <td><%= rs.getString("dropoff_location") %></td>
        <td><%= rs.getInt("fare") %></td>
        <td><%= rs.getString("status") %></td>
        <td><%= rs.getTimestamp("ride_time") %></td>
        <td>
            <form method="post" action="cancelRide">
                <input type="hidden" name="bookingId" value="<%= rs.getInt("id") %>">
                <button type="submit">Cancel</button>
            </form>
        </td>
    </tr>
    <% } con.close(); %>
</table>
<a href="index.jsp">Book Ride</a>
</body>
</html>