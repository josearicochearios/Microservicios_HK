package com.vallegrande.edu.ms1_user.service.impl;

import com.vallegrande.edu.ms1_user.model.User;
import com.vallegrande.edu.ms1_user.repository.UserRepository;
import com.vallegrande.edu.ms1_user.service.UseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.*;


@Service
public class UserServiceImpl implements UseService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public Flux<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Mono<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Mono<User> save(User user) {
        user.setActive(true);
        return userRepository.save(user);
    }

    @Override
    public Mono<User> update(User user) {
        return userRepository.save(user);
    }
}
