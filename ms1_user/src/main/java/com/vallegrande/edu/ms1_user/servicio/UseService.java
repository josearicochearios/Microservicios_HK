package com.vallegrande.edu.ms1_user.servicio;

import com.vallegrande.edu.ms1_user.modelo.User;

import java.util.List;

public interface UseService {

    List<User> findAll();

    User create(User user);

    User update(User user);

    void delete(String id);

}
