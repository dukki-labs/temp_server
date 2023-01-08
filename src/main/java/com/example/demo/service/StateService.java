package com.example.demo.service;

import com.example.demo.dto.User;
import com.example.demo.entity.UserTest;
import com.example.demo.repository.UserTestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class StateService {

    private final UserTestRepository userTestRepository;

    @Transactional(readOnly = true)
    public List<UserTest> getUserStateList() {
        return userTestRepository.findAll();
    }

    public void createUser(User user) {
        UserTest userTest = new UserTest();
        userTest.createUser(user);
        userTestRepository.save(userTest);
    }
}
