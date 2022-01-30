package com.sda.hibernate.entity;


import javax.persistence.*;
import java.lang.reflect.GenericArrayType;

@Entity
public class Husband {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;


    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "my_wife_id")
    Wife wife;


    public Husband() {
    }

    public Husband(String name) {
        this.name = name;

    }
    public Husband(String name, Wife wife) {
        this.name = name;
        this.wife = wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public Object getName() {
        return name;
    }
}
