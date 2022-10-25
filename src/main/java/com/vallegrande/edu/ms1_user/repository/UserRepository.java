package com.vallegrande.edu.ms1_user.repository;

import com.vallegrande.edu.ms1_user.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {
}
