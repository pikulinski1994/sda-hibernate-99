package com.sda.hibernate.entity;


import javax.persistence.Embeddable;

@Embeddable
public class Adress {

    String street;
    String city;

    public Adress() {

    }


    public Adress(String street, String city) {
        this.street = street;
        this.city = city;

    }

    public void setStreet(String street) {
        this.street = street;
    }
}


