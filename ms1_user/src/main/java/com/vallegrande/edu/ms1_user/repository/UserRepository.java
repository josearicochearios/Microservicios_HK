package com.vallegrande.edu.ms1_user.repository;

import com.vallegrande.edu.ms1_user.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
