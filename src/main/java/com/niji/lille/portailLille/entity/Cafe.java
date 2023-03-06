package com.niji.lille.portailLille.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Cafe {

    @Id
    private String id;

    private String lienCagnotte;
    private String image;

    //constructor:

    public Cafe() {
    }

    public Cafe(String id, String lienCagnotte, String image) {
        this.id = id;
        this.lienCagnotte = lienCagnotte;
        this.image = image;
    }

    //getter et setter:


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLienCagnotte() {
        return lienCagnotte;
    }

    public void setLienCagnotte(String lienCagnotte) {
        this.lienCagnotte = lienCagnotte;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
