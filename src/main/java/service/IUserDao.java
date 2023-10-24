package service;

import model.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserDao {
    public boolean updateUser(User user) throws SQLException, IOException, ClassNotFoundException;
    public List<User> selectUser(int idUser ) throws SQLException, IOException, ClassNotFoundException;
}
