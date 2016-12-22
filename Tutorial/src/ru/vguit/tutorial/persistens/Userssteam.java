/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vguit.tutorial.persistens;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Сущность, которая будет маппитьсяв БД
 * 
 * @author a.pleshkanev
 */
    @Entity
    @Table(name="userssteam")
    public class Userssteam implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="name")
        private String name;

        @Column(name="nameaccount")
        private String nameaccount;

        @Column(name="city")
        private String city;
        
        @Column(name="email")
        private String email;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public String getNameaccount() {
        return nameaccount;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameaccount(String nameaccount) {
        this.nameaccount = nameaccount;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Userssteam(String name, String nameaccount, String city, String email) {
        this.name = name;
        this.nameaccount = nameaccount;
        this.city = city;
        this.email = email;
    }

    public Userssteam() {
    }


   
        @Override
        public String toString() {
            return String.format("(%s, %s, %s, %s, %s)", this.name, this.nameaccount, this.city, this.email, this.id);
        }
    }

