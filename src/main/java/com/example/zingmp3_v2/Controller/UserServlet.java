package com.example.zingmp3_v2.Controller;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import com.example.zingmp3_v2.Model.User;
import com.example.zingmp3_v2.Service.UserDAO;


import java.sql.SQLException;
import java.util.Optional;
import javax.servlet.ServletException;

    @WebServlet(name = "UserServlet", value = "/login")
public class UserServlet extends HttpServlet {
    private UserDAO userDAO;

    public void init() throws ServletException {
         userDAO = new UserDAO();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        System.out.println(action);
        try {
            switch (action) {
                case "Login":
                    Login(request, response);
                    break;
                case "formChangePassword":
                    formChangePassword(request, response);
                    break;
                case "changePassword":
                    updatePassword(request, response);
                    break;
                default:
                    break;
            }
        } catch (IOException e) {
            throw new IOException();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void formChangePassword(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = 1;
        request.setAttribute("id", id);
        request.getRequestDispatcher("formChangePassword.jsp").forward(request, response);
    }

    private void updatePassword(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException, ClassNotFoundException {
        int id = Integer.parseInt(request.getParameter("id"));
        String oldPassword = request.getParameter("oldPassword");
        String newPassword = request.getParameter("newPassword");
        String confirmPassword = request.getParameter("confirmPassword");

        User user = userDAO.selectPassword(id);

        if (oldPassword.equals(user.getPassword())) {
            if (newPassword.equals(confirmPassword)){
                userDAO.updatePassword(id, newPassword);
                request.setAttribute("id", id);
                request.getRequestDispatcher("formChangePassword.jsp").forward(request,response);
            }else {
                request.setAttribute("messages","Mật khẩu không khớp");
                request.setAttribute("id", id);
                request.getRequestDispatcher("formChangePassword.jsp").forward(request,response);
            }
        }else {
            request.setAttribute("message","Mật khẩu cũ không đúngs");
            request.setAttribute("id", id);
            request.getRequestDispatcher("formChangePassword.jsp").forward(request,response);
        }

    }

    public void Login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        Optional<User> optionalUser = userDAO.getUserByUsername(username);
        if (optionalUser.isPresent() && userDAO.verifyUserPassword(optionalUser.get(), password)) {
            request.getRequestDispatcher("Home.jsp").forward(request,response);
        } else {
            response.sendRedirect("Error.jsp");
        }
    }
}
