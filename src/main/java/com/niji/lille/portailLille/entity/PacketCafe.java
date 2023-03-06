package com.niji.lille.portailLille.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class PacketCafe {
    @Id
    private String id;

    private String nom;

    private String lienCagnotte;

    private int quantite;

    private double price;

    public PacketCafe() {
    }

    public PacketCafe(String id, String nom, String lienCagnotte, int quantite, double price) {
        this.id = id;
        this.nom = nom;
        this.lienCagnotte = lienCagnotte;
        this.quantite = quantite;
        this.price = price;
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

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
