<%--
  Created by IntelliJ IDEA.
  User: duk
  Date: 23/10/2023
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form method="post" action="/register">
    <table>
        <tr>
            <label for="email">Email (*):</label>
            <input type="email" id="email" name="email" required>
        </tr>
        <tr>
            <label for="username">Name (*):</label>
            <input type="text" id="username" name="username" required>
        </tr>
        <tr>
            <label for="phone">Phone:</label>
            <input type="text" id="phone" name="phone">
        </tr>
        <tr>
            <label for="password">Mật khẩu (*):</label>
            <input type="password" id="password" name="password" required>
        </tr>
        <tr>
            <label for="repassword">Nhập lại mật khẩu (*):</label>
            <input type="password" id="repassword" name="repassword" required>
        </tr>
        <input type="submit" value="Register">
    </table>
</form>
</body>
</html>
