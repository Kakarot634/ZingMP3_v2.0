package com.example.zingmp3_v2.Service;

import com.example.zingmp3_v2.Model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDAO implements IUserDAO{
    private static final String url = "jdbc:mysql://localhost:3306/UserInfo";
    private static final String username = "root";
    private static final String password   = "07122004";

    @Override
    public Optional<User> getUserByUsername(String username){
        try(Connection connection =DriverManager.getConnection(url, username, password)){
            String sql = "SELECT username, password FROM users WHERE username = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String fetchedUsername = resultSet.getString("username");
                String fetchedPassword = resultSet.getString("password");
                User user = new User();
                user.setUsername(fetchedUsername);
                user.setPassword(fetchedPassword);
                return Optional.of(user);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
    @Override
    public boolean verifyUserPassword(User user, String password){
        return user != null && user.getPassword().equals(password);
    }
}
