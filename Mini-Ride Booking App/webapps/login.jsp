<!DOCTYPE html>
<html>
<head><title>Login</title></head>
<body>
<h2>Login</h2>
<form action="login" method="post">
    Username: <input name="username"><br>
    Password: <input type="password" name="password"><br>
    <button>Login</button>
</form>
<% if (request.getParameter("error") != null) { %>
<p style="color:red;"><%= request.getParameter("error") %></p>
<% } %>
</body>
</html>