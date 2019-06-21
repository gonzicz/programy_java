package com.sda.rest_api.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String login;
    private String name;
    private String surname;
    private String password;
    private String role;
    private String mail;

}
