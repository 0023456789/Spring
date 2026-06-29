package com.example.Second.Service;

import com.example.Second.Repository.UserRepository;
import com.example.Second.dto.request.UserCreationRequest;
import com.example.Second.dto.request.UserUpdateRequest;
import com.example.Second.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(UserCreationRequest request){
        User user = new User();
        if (userRepository.existsByUsername(request.getUsername()))
                throw new RuntimeException("User existed");
        user.setFullName((request.getFullName()));
        user.setDateOfBirth(request.getDateOfBirth());
        user.setPassword(request.getPassword());
        user.setUsername(request.getUsername());

        return userRepository.save(user);
    }
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(String id){
        return userRepository.findById(id).orElseThrow(() ->new RuntimeException("User not found"));
    }


    public User updateUser(String userId, UserUpdateRequest request) {
        User user = new User();
        user.setFullName((request.getFullName()));
        user.setDateOfBirth(request.getDateOfBirth());
        user.setPassword(request.getPassword());
        return userRepository.save(user);
   }

    public void deteleUser(String userId) {
        userRepository.deleteById(userId);
    }
}
