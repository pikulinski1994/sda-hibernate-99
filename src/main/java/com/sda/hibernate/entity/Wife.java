package com.sda.hibernate.entity;


import javax.persistence.*;

@Entity
public class Wife {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToOne(mappedBy = "wife")
    Husband husband;

    public Wife() {
    }

    public Wife(String name) {
        this.name = name;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
        this.husband.setWife(this);
    }
}
