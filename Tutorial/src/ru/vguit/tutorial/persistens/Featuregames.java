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
    @Table(name="featuregames")
    public class Featuregames implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="namegame")
        private String namegame;

        @Column(name="genre")
        private String genre;

        @Column(name="publisher")
        private String publisher;
        
        @Column(name="developer")
        private String developer;
        
        @Column(name="dateofrelease")
        private String dateofrelease;
        
        @Column(name="rating")
        private int rating;

        @Column(name="sale")
        private int sale;
        
        @Column(name="price")
        private String price;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNamegame() {
        return namegame;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getDateofrelease() {
        return dateofrelease;
    }

    public int getRating() {
        return rating;
    }

    public int getSale() {
        return sale;
    }

    public String getPrice() {
        return price;
    }

    public void setNamegame(String namegame) {
        this.namegame = namegame;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public void setDateofrelease(String dateofrelease) {
        this.dateofrelease = dateofrelease;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Featuregames(String namegame, String genre, String publisher, String developer, String dateofrelease, int rating, int sale, String price) {
        this.namegame = namegame;
        this.genre = genre;
        this.publisher = publisher;
        this.developer = developer;
        this.dateofrelease = dateofrelease;
        this.rating = rating;
        this.sale = sale;
        this.price = price;
    }

    public Featuregames() {
    }

   
        @Override
        public String toString() {
            return String.format("(%s, %s, %s, %s, %s, %s, %d, %d, %s)", this.namegame, this.genre, this.publisher, this.developer, this.dateofrelease, this.rating, this.sale, this.price, this.id);
        }
    }

