package com.sda.hibernate.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee_table")

public class Employee<Gender> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String name;
    @Column(name = "password")
    String secret;
    @Column(length = 9, unique = true)
    String telephonenumber;
    @Transient
    long age;
    @Temporal(TemporalType.DATE)
    Date birthdate;
    @Enumerated(EnumType.STRING)
    Gender gender;
    @Lob
    String description;

    public Employee() {


    }

    public Employee(String name, String secret) {
        this.name = name;
        this.secret = secret;
        this.telephonenumber = telephonenumber;
        this.age = age;
        this.birthdate = birthdate;
        this.gender = gender;
        this.description = description;
    }

    public enum Gender {
        Male, Female;
    }
}


