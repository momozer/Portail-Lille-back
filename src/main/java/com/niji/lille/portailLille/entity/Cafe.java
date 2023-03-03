package com.niji.lille.portailLille.entity;

import org.springframework.data.annotation.Id;

public class Cafe {
    @Id
    private String id;

    private String nom;

    private String lienCagnotte;

    private Integer paquetCafe;

    public Cafe() {
    }

    public Cafe(String id, String nom, String lienCagnotte, Integer paquetCafe) {
        this.id = id;
        this.nom = nom;
        this.lienCagnotte = lienCagnotte;
        this.paquetCafe = paquetCafe;
    }

    //Getter et setter:


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLienCagnotte() {
        return lienCagnotte;
    }

    public void setLienCagnotte(String lienCagnotte) {
        this.lienCagnotte = lienCagnotte;
    }

    public Integer getPaquetCafe() {
        return paquetCafe;
    }

    public void setPaquetCafe(Integer paquetCafe) {
        this.paquetCafe = paquetCafe;
    }
}
