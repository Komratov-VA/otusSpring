package ru.otus.spring10.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return id + " name = " + name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
