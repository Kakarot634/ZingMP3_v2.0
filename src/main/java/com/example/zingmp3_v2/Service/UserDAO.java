package com.example.zingmp3_v2.Service;

import com.example.zingmp3_v2.Model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDAO implements IUserDAO{
    private static final String url = "jdbc:mysql://localhost:3306/Admin";
    private static final String userName = "root";
    private static final String pass   = "1";

    private static final String SELECT_PASSWORD = "select pass from UserInformation where id=?";
    private static final String UPDATE_PASSWORD = "update UserInformation set pass=? where id=?";

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url,userName,pass);
        return connection;
    }


    @Override
    public Optional<User> getUserByUsername(String name){
        try(Connection connection =DriverManager.getConnection(url, userName, pass)){
            String sql = "SELECT username, password FROM UserInformation WHERE username = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
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
    public boolean verifyUserPassword(User user, String pass){
        return user != null && user.getPassword().equals(pass);
    }

    @Override
    public User selectPassword(int id) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        User user = null;
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PASSWORD);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String pass = resultSet.getString("pass");
            user = new User(pass);
        }
        return  user;
    }

    @Override
    public void updatePassword(int id, String newPassword) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PASSWORD);
        preparedStatement.setString(1,newPassword);
        preparedStatement.setInt(2,id);
        preparedStatement.executeUpdate();
    }


}
