<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<style>
    * {
        margin: 0;
        padding: 0;
    }
    #wrapper {
        width: auto;
        margin: auto;
    }
    #header {
        width: 1848px;
        height: 100px;
        background-color: #1f1f1f;
    }
    #menu {
        width: 1848px;
        height: 70px;
        background-color: #18191e;
    }
    #left {
        width: 20%;
        height: 704px;
        background-color: #171b25;
        float: left;
    }
    #content {
        width: 60%;
        height: 704px;
        background-color: #030715;
        float: left;
    }
    #right {
        width: 20%;
        height: 704px;
        background-color: #030715;
        float: left;
    }
    #footer {
        width: 1848px;
        height: 70px;
        background-color:#18191e;
        clear: both;
    }
    #zing-logo {
        position: absolute;
        top: 10px;
        left: 25px;
        width: 150px;
        height: 70px;
    }
    h2 {
        font-family: "Tibetan Machine Uni" , sans-serif;
        font-size: 25px;
        color: #fff;
    }
    .drop-ttn {
        width: 70px;
        font-size: 28px;
        background-image: none;
        background-color: transparent;
    }
    #menu {
        display: flex;
        justify-content: space-between;
        align-items: center;
        background-color: #333;
        color: #fff;
    }
    #menu h2 {
        margin: 0;
    }
    .search-container {
        position: absolute;
        top: 30px;
        left: auto;
        right: 25px;
    }

    .search-input {
        padding: 5px;
        width: 300px;
        -webkit-border-radius: 15px;
        font-size: 18px;
        background-image: url("tải xuống.png");
        background-repeat: no-repeat;
        background-position: 10px center;
        background-size: 20px 20px;
        padding-left: 40px;
    }
    .search-button {
        padding: 5px;
        font-size: 18px;
        -webkit-border-radius: 15px;
    }
    .hover-listPlay ul {
        list-style-type: disc;
        color: #fff;
        padding: 0;
    }

    .hover-listPlay ul li {
        padding: 20px;
    }

    .hover-listPlay ul li:hover {
        color: deepskyblue;
    }

</style>
<head>
    <title>Zing MP3</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
</head>
<body>
<div id="wrapper">
    <div id="header">
        <div class="header-conter">
            <img src="ZingMP3logo.svg.png" id="zing-logo">
        </div>
        <div class="search-container">
            <input type="text" id="search-input" class="search-input" placeholder="Nhập từ khóa tìm kiếm...">
            <button type="button" id="search-button" class="search-button">Tìm kiếm</button>
        </div>
    </div>
    <div id="menu">
        <h2>PlayList</h2>
        <a class="drop-ttn"><i class="fa fa-bars" style="color: #fff"></i></a>
    </div>
    <div id="left">
        <div class="hover-listPlay">
        <ul>
            <li class="menu-myPlaylist" style="color: #fff"><a href="Login.jsp" style="color: #fff">My Playlist</a></li>
            <li class="menu-last" style="color: #fff">Last Listening</li>
            <li class="menu-recommended" style="color: #fff">Recommended</li>
        </ul>
        </div>
    </div>

    <div id="content"></div>
    <div id="right"></div>
    <div id="footer"></div>
</div>
</body>
</html>
<%--// Nút thay đổi mật khẩu // --%>

<%--<form action="/login" method="post">--%>

<%--    <button value="formChangePassword" name="action" >Change Password</button>--%>