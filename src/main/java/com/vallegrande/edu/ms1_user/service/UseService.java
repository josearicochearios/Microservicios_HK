package com.vallegrande.edu.ms1_user.service;

import com.vallegrande.edu.ms1_user.model.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.*;

@Service
public interface UseService {

    Flux<User> findAll();

    Mono<User> findById(Long id);

    Mono<User> save(User user);

    Mono<User> update(User user);;


}
