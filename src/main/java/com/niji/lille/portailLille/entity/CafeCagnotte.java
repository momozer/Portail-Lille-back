package com.niji.lille.portailLille.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class CafeCagnotte {

    @Id
    private String id;

    private double cagnotte;
    private String lien;

    public CafeCagnotte() {
    }

    public CafeCagnotte(String id, double cagnotte, String lien) {
        this.id = id;
        this.cagnotte = cagnotte;
        this.lien = lien;
    }

    //getter et setter:


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCagnotte() {
        return cagnotte;
    }

    public void setCagnotte(double cagnotte) {
        this.cagnotte = cagnotte;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }
}
