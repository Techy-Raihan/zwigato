package com.zwigato.zwigato.Service;

import java.util.List;

import com.zwigato.zwigato.Entity.User;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);

    
    
}
