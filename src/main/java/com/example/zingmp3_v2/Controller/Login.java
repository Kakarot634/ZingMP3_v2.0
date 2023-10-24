package com.example.zingmp3_v2.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "Login", value = "/login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/admin";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "07122004";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("username");
        String pass = request.getParameter("password");
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            String query = "SELECT * FROM UserInformation WHERE email = ? AND pass = ?";
            statement = conn.prepareStatement(query);
            statement.setString(1, email);
            statement.setString(2, pass);
            rs = statement.executeQuery();

            if (rs.next()) {
                request.setAttribute("message", "Login Successful!");
            } else {
                request.setAttribute("message", "Login Failed. Check your username or password and try it again!");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null){
                    rs.close();
                }
                if (statement != null){
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        request.getRequestDispatcher("listUser.jsp").forward(request, response);
    }
}
