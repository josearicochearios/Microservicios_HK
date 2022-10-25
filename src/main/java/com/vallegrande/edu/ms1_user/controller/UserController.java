package com.vallegrande.edu.ms1_user.controller;

import com.vallegrande.edu.ms1_user.model.User;
import com.vallegrande.edu.ms1_user.service.UseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UseService useService;

    @GetMapping
    public Flux<User> findAll(){
        return useService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<User> findById(Long id) {
        return useService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Mono<User> create(@RequestBody User user){
        return useService.save(user);
    }

    @PutMapping
    public Mono<User> update(@RequestBody User user){
        return useService.update(user);
    }

}
