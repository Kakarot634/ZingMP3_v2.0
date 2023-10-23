package com.example.zingmp3_v2.Service;

import com.example.zingmp3_v2.Model.User;

import java.util.List;
import java.util.Optional;

public interface IUserDAO {
    Optional<User> getUserByUsername(String username);
    boolean verifyUserPassword(User user, String password);
}
