<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 23/10/2023
  Time: 2:54 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body {
        display: flex;
        align-items: center;
        justify-content: center;
        height: 100vh;
    }

    body {
        font-family: "Tibetan Machine Uni"  , sans-serif;
        background-color: #faf7f7;
        margin: 0;
        padding: 10px;
        display: flex;
        align-items: center;
        justify-content: center;
        height: 100vh;
    }

    .login-container {
        max-width: 600px;
        background-color: #ffffff;
        padding: 90px;
        border-radius: 6px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        /*background: #f5f1f1;*/
    }

    h1 {
        text-align: center;
    }

    .form-group {
        margin-bottom: 20px;
    }

    label {
        display: block;
        margin-bottom: 5px;
    }

    input[type="name"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }
    input[type="password"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        background-color: #4caf50;
        color: #ffffff;
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
<head>
    <title>JSP Page</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<div class="login-container">
    <h1> ZingMP3 Music</h1>
    <form action="login" method="post">
        <div class="form-group">
            <label for="name">UserName:</label>
            <input type="name" id="name" name="name" required>
        </div>
        <div class="form-group">
            <label for="pass">Password:</label>
            <input type="password" id="pass" name="pass" required>
        </div>
        <div class="form-group">
            <form action="Home.jsp">
                <input type="submit" name="action" value="Login">
            </form>
        </div>
    </form>
</div>
</body>
</html>
