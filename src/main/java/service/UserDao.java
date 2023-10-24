package service;

import model.User;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements IUserDao{
    private String url = "jdbc:mysql://localhost:3306/Admin";
    private String username = "root";
    private String password = "2004";

    private static final String UPDATE_USERS_SQL = "update UserInformation set name = ?,email= ?, phone =? where id = ?;";
    private static final String SELECT_USER = "select id,name , email,phone from UserInformation where id = ?;";

    public void UserDAO(){

    }
    public Connection getConnection() throws IOException, ClassNotFoundException, SQLException, SQLException {
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    @Override
    public boolean updateUser(User user) throws SQLException, IOException, ClassNotFoundException {
        boolean rowUpdate;
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getEmail());
        preparedStatement.setInt(3, user.getPhone());
        preparedStatement.setInt(4, user.getId());
        rowUpdate = preparedStatement.executeUpdate() > 0;
        return rowUpdate;
    }

    @Override
    public List<User> selectUser(int idUser) throws SQLException, IOException, ClassNotFoundException {
        List<User> list = new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER);
        preparedStatement.setInt(1,idUser);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            int phone = resultSet.getInt("phone");
            list.add(new User(id,name,email,phone));
        }
        return list;
    }
}


