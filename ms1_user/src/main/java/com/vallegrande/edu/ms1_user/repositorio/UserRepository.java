package com.vallegrande.edu.ms1_user.repositorio;

import com.vallegrande.edu.ms1_user.modelo.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends MongoRepository<User, String> {
}
