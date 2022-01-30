package com.sda.hibernate.entity;


import javax.persistence.*;

@Entity
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String description;
    @Embedded
    Adress adress;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
