package Controller;


import DAO.UserDAO;
import Model.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



    @WebServlet(name= "register", value = "/register")
    public class RegisterServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws IOException {

            String email = request.getParameter("email");
            String name = request.getParameter("name");
            int phone = Integer.parseInt(request.getParameter("phone"));
            String rePassword = request.getParameter("rePassword");
            String password = request.getParameter("password");

            UserDAO userDAO = new UserDAO();

            if (!password.equals(rePassword)) {
                userDAO.addUser((new User(name,email,password)));
                System.out.println("Da thanh cong");
                response.sendRedirect("/View/login.jsp");

            }else {
                System.out.println("Vui long nhap lai");
                response.sendRedirect("/View/register.jsp");
            }
        }
    }