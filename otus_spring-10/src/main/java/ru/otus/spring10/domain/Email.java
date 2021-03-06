package ru.otus.spring10.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Email {

    @Id
    @GeneratedValue
    private int id;

    private String email;

    public Email(String email) {
        this.email = email;
    }

    public Email() {

    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
