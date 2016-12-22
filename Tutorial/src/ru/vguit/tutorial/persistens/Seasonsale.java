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
    @Table(name="seasonsale")
    public class Seasonsale implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="namegame")
        private String namegame;

        @Column(name="sale")
        private int sale;

        @Column(name="price")
        private int price;
        
        @Column(name="discountprice")
        private int discountprice;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNamegame() {
        return namegame;
    }

    public int getSale() {
        return sale;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscountprice() {
        return discountprice;
    }

    public void setNamegame(String namegame) {
        this.namegame = namegame;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscountprice(int discountprice) {
        this.discountprice = discountprice;
    }

    public Seasonsale(String namegame, int sale, int price, int discountprice) {
        this.namegame = namegame;
        this.sale = sale;
        this.price = price;
        this.discountprice = discountprice;
    }

    public Seasonsale() {
    }

   
        @Override
        public String toString() {
            return String.format("(%s, %d, %d, %d, %d)", this.namegame, this.sale, this.price, this.discountprice, this.id);
        }
    }

