package com.example.zingmp3_v2.Controller;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import com.example.zingmp3_v2.Model.User;
import com.example.zingmp3_v2.Service.UserDAO;


import java.util.List;
import java.util.Optional;
import javax.servlet.ServletException;

@WebServlet(name = "Login", value = "/login")
public class Login extends HttpServlet {
    private UserDAO userDAO;

    public void init() throws ServletException{
        UserDAO userDAO =   new UserDAO();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Optional<User> optionalUser = userDAO.getUserByUsername(username);
        if (optionalUser.isPresent() && userDAO.verifyUserPassword(optionalUser.get(), password)) {
            response.sendRedirect("Success.jsp");
        } else {
            response.sendRedirect("Error.jsp");
        }
    }
}
