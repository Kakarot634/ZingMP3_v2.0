<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
    <style>
        /* styles.css */
        body {
            background-color: #f2f2f2;
            font-family: Arial, sans-serif;
        }

        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            border-radius: 5px;
            text-align: center;
        }

        h1 {
            color: #4caf50;
        }

        p {
            font-size: 18px;
            margin-bottom: 20px;
        }

        .link {
            color: #4caf50;
            text-decoration: none;
        }
    </style>
<body>
<div class="container">
    <form action="login" method="post">
        <h1>Login Successful!</h1>
        <p>Click <a href="Logout.jsp" class="link">here</a> to logout.</p>
    </form>
</div>
</body>
</html>
