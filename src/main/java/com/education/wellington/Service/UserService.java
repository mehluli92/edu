package com.education.wellington.Service;

import com.education.wellington.Entity.User;
import com.education.wellington.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(User user){
        User oldUser = userRepository.findById(user.getId()).orElse(null);
        return userRepository.save(user);
    }
    public String deleteUser(Long id){
        User user = userRepository.findById(id).orElse(null);
        if(user == null){
            return "User does not exist";
        } else{
            userRepository.deleteById(id);
        }
        return "User deleted with success";
    }
}
