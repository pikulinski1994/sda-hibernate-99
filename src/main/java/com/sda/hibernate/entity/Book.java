package com.sda.hibernate.entity;


import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

  @ManyToOne
    Client client;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
