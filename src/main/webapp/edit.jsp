<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hathanhtinh
  Date: 23/10/2023
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Data</title>
    <style>
        body{
            background-image: url("https://noithatbinhminh.com.vn/wp-content/uploads/2022/08/anh-dep-19.jpg");
            background-size: cover;
        }
        .update-form {
            max-width: 400px;
            margin: 0 auto;
        }

        .form-group {
            margin-bottom: 10px;
        }

        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }

        input[type="text"],
        textarea {
            width: 100%;
            padding: 5px;
            border: 1px solid #ccc;
        }
    </style>
</head>
<body>
<h1 style="text-align: center">Update Data</h1>
<div class="update-form">
    <form action="music" method="post">
        <c:forEach var="list" items="${list}">
            <div class="form-group">
                <input type="hidden" name="id" value="${list.id}">
                <label for="name">Name:</label>
                <input style="background-color: bisque" type="text" id="name" name="name" value="${list.name}" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input style="background-color: bisque" type="text" id="email" name="email" value="${list.email}" required>
            </div>
            <div class="form-group">
                <label for="email">Phone:</label>
                <input style="background-color: bisque" type="text" id="phone" name="phone" value="${list.phone}" required>
            </div>
            <button style="background-color: crimson" name="action" value="edit">Update</button>
        </c:forEach>
    </form>
</div>
</body>
</html>

