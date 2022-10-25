package com.vallegrande.edu.ms1_user.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "users")
public class User {

    @Id private Long id;
    @Column private String username;
    @Column private String password;
    @Column private Integer level;
    @Column private Boolean active;
}
