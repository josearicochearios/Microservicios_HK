package com.vallegrande.edu.ms1_user.service;

import com.vallegrande.edu.ms1_user.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User create(User user);

    User update(User user);

    void delete(String id);

}
