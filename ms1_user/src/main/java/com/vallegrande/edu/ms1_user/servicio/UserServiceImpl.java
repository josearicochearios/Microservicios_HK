package com.vallegrande.edu.ms1_user.servicio;

import com.vallegrande.edu.ms1_user.modelo.User;
import com.vallegrande.edu.ms1_user.repositorio.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UseService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        Optional<User> optionalUser = userRepository.findById(user.getId());
        if(!optionalUser.isPresent()) throw new RuntimeException("No se encontro el usuario");
        return userRepository.save(user);
    }

    @Override
    public void delete(String id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if(!optionalUser.isPresent()) throw new RuntimeException("No se encontro el usuario");
        userRepository.deleteById(id);
    }
}
