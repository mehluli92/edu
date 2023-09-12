package com.education.wellington.Controller;

import com.education.wellington.Entity.User;
import com.education.wellington.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @PutMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }
}
