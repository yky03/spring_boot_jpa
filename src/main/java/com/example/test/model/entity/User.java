package com.example.test.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private LocalDateTime regDt;
    private String regUser;
    private LocalDateTime modDt;
    private String modUser;
}

   /*
        MYSQL
        CREATE TABLE `test`.`user` (
        `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
        `name` VARCHAR(45) NULL,
        `email` VARCHAR(45) NULL DEFAULT NULL,
        `phone_number` VARCHAR(45) NULL DEFAULT NULL,
        `reg_dt` VARCHAR(45) NOT NULL,
        `reg_user` VARCHAR(45) NOT NULL,
        `mod_dt` VARCHAR(45) NULL DEFAULT NULL,
        `mod_user` VARCHAR(45) NULL DEFAULT NULL,
        PRIMARY KEY (`id`));*/
