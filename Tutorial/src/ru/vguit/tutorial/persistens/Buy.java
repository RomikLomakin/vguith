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
    @Table(name="buy")
    public class Buy implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="nameaccount")
        private String nameaccount;

        @Column(name="namegame")
        private String namegame;

        @Column(name="purchasedate")
        private String purchasedate;


    public long getId() {
        return id;
    }

    public String getNameaccount() {
        return nameaccount;
    }

    public String getNamegame() {
        return namegame;
    }

    public String getPurchasedate() {
        return purchasedate;
    }

    public void setNameaccount(String nameaccount) {
        this.nameaccount = nameaccount;
    }

    public void setNamegame(String namegame) {
        this.namegame = namegame;
    }

    public void setPurchasedate(String purchasedate) {
        this.purchasedate = purchasedate;
    }

    public Buy(String nameaccount, String namegame, String purchasedate) {
        this.nameaccount = nameaccount;
        this.namegame = namegame;
        this.purchasedate = purchasedate;
    }

    public Buy() {
    }
        
        @Override
        public String toString() {
            return String.format("(%s, %s, %s, %d)", this.nameaccount, this.namegame, this.purchasedate, this.id);
        }
    }

