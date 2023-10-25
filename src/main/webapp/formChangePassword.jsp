<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kimanh
  Date: 23/10/2023
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- formChangePassword.jsp -->
<!DOCTYPE html>
<html>
<head>
    <title>Change Password</title>
    <style>
        /* CSS cho form */
        form {
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        h2 {
            text-align: center;
        }

        .form-group {
            margin-bottom: 15px;
        }

        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        .message {
            color: red;
            margin-top: 10px;
        }

        .button {
            background-color: #4CAF50;
            color: white;
            padding: 20px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<h2>Change Password</h2>
<form action="/login" method="post">
<%--    <c:forEach var="list" items="${User}">--%>
    <div class="form-group">
        <input type="hidden" name="id" value="${id}">
        <label for="oldPassword">Old Password:</label>
    <div class="message">
        ${message}
    </div>
        <input type="password" name="oldPassword" id="oldPassword" required>
    </div>

    <div class="form-group">
        <label for="newPassword">New Password:</label>
        <input type="password" name="newPassword" id="newPassword" required>
    </div>

    <div class="form-group">
        <label for="confirmPassword">Confirm Password:</label>
        <div class="message">
            ${messages}
        </div>
        <input type="password" name="confirmPassword" id="confirmPassword" required>
    </div>



    <input type="hidden" name="id" value="${id}">
    <form action="/login?action=changePassword" method="post">
        <button name="action" value="changePassword" style="background: #4CAF50"> Save </button>
    </form>
<%--    </c:forEach>--%>
</form>
</body>
</html>
