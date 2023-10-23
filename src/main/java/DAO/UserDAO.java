package DAO;

import Model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO implements IUserDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/Admin";
    private static final String username = "username";
    private static final String password = "password";

    public static Connection connect() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, username, password);
            System.out.println("Kết nối thành công ");
        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
    @Override
    public void addUser(User user) {
        UserDAO userDAO = new UserDAO();
        try {
            Connection connection = userDAO.connect();
            String query = "INSERT INTO user(email,name,phone,password,rePassword) VALUES (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2,user.getName());
            preparedStatement.setInt(3,user.getPhone());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5,user.getRePassword());
            preparedStatement.executeUpdate();
            System.out.println("them du lieu thanh con");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
