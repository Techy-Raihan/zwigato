package com.zwigato.zwigato.Service.Implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zwigato.zwigato.Entity.User;
import com.zwigato.zwigato.Repository.UserRepo;
import com.zwigato.zwigato.Service.UserService;

@Service
public class UserServiceImpl implements UserService{

    public UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        super();
        this.userRepo = userRepo;
    }

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepo.findById(id).get();
    }

    @Override
    public User updateUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }



    
}
