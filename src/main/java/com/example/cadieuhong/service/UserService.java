package com.example.cadieuhong.service;

import com.example.cadieuhong.enity.User;
import com.example.cadieuhong.mapper.UserMapper;
import com.example.cadieuhong.repository.UserRepository;
import com.example.cadieuhong.request.UserCreationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public User createRequest(UserCreationRequest request){
        User user = userMapper.toUser(request);

        return userRepository.save(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(String id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
