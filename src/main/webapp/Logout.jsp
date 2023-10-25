<%--
  Created by IntelliJ IDEA.
  User: kimanh
  Date: 23/10/2023
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <style>
        .container {
            width: 300px;
            padding: 20px;
            margin: 100px auto;
            text-align: center;
            background: #fff;
            border: 1px solid #ccc;

        }

        h2 {
            color: #4CAF50;
        }

        p {
            margin-top: 20px;
            color: #131212;
        }

        .btn-logout {
            display: inline-block;
            padding: 10px 20px;
            background-color: #f44336;
            color: #fff;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
        }

        .btn-logout:hover {
            background-color: #d32f2f;
        }

        .btn-logout:focus {
            outline: none;
        }
    </style>

    <!DOCTYPE html>
    <html>
    <head>
        <title>Logout</title>
        <link rel="stylesheet" type="text/css" href="styles.css">
    </head>
    <body>
    <div class="container">
        <h2>Logout</h2>
        <p>Are you sure you want to log out?</p>
        <button class="btn-logout">Logout</button>
    </div>
    </body>
    </html>

