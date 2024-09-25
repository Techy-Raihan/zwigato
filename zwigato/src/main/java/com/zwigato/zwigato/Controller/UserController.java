package com.zwigato.zwigato.Controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

import com.zwigato.zwigato.Entity.User;
import com.zwigato.zwigato.Service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) 
    {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(Model model)
    {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return users;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id)
    {
        return userService.getUserById(id);
    }

    @GetMapping("/user/delete")
    public void deleteUser(@RequestParam Long id)
    {
        userService.deleteUser(id);
    }

    @GetMapping("/user/update")
    public void updateUser(@RequestParam Long id, @RequestParam String name, @RequestParam String email)
    {
        User user = userService.getUserById(id);
        user.setName(name);
        user.setEmail(email);
        userService.createUser(user);
    }

    @PostMapping("/user/create")
    public String createUser(@ModelAttribute("user") User user)
    {
        userService.createUser(user);
        return "redirect:/users";
    }   
}
