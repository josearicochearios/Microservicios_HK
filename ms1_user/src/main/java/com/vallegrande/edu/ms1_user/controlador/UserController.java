package com.vallegrande.edu.ms1_user.controlador;

import com.vallegrande.edu.ms1_user.modelo.User;
import com.vallegrande.edu.ms1_user.servicio.UseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ms1_user/v1/user")
public class UserController {

    @Autowired
    private UseService useService;

    @GetMapping
    public List<User> findAll(){
        return useService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public User create(@RequestBody User user){
        return useService.create(user);
    }

    @PutMapping
    public User update(@RequestBody User user){
        return useService.update(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        useService.delete(id);
    }
}
