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
    @Table(name="systemrequirements")
    public class Systemrequirements implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="namegame")
        private String namegame;

        @Column(name="os")
        private String os;

        @Column(name="ram")
        private String ram;
        
        @Column(name="freespace")
        private String freespace;
        
        @Column(name="videomemory")
        private String videomemory;
        
        @Column(name="versionDirext")
        private String versionDirext;

        @Column(name="numberofcores")
        private String numberofcores;
        
        @Column(name="processorspeed")
        private String processorspeed;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNamegame() {
        return namegame;
    }

    public String getOs() {
        return os;
    }

    public String getRam() {
        return ram;
    }

    public String getFreespace() {
        return freespace;
    }

    public String getVideomemory() {
        return videomemory;
    }

    public String getVersionDirext() {
        return versionDirext;
    }

    public String getNumberofcores() {
        return numberofcores;
    }

    public String getProcessorspeed() {
        return processorspeed;
    }

    public void setNamegame(String namegame) {
        this.namegame = namegame;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setFreespace(String freespace) {
        this.freespace = freespace;
    }

    public void setVideomemory(String videomemory) {
        this.videomemory = videomemory;
    }

    public void setVersionDirext(String versionDirext) {
        this.versionDirext = versionDirext;
    }

    public void setNumberofcores(String numberofcores) {
        this.numberofcores = numberofcores;
    }

    public void setProcessorspeed(String processorspeed) {
        this.processorspeed = processorspeed;
    }

    public Systemrequirements(String namegame, String os, String ram, String freespace, String videomemory, String versionDirext, String numberofcores, String processorspeed) {
        this.namegame = namegame;
        this.os = os;
        this.ram = ram;
        this.freespace = freespace;
        this.videomemory = videomemory;
        this.versionDirext = versionDirext;
        this.numberofcores = numberofcores;
        this.processorspeed = processorspeed;
    }

    public Systemrequirements() {
    }
        
    
        @Override
        public String toString() {
            return String.format("(%s, %s, %s, %s, %s, %s, %s, %s, %s)", this.namegame, this.os, this.ram, this.freespace, this.videomemory, this.versionDirext, this.numberofcores, this.processorspeed, this.id);
        }
    }

