package com.niji.lille.portailLille.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Place {
    @Id
    private String id;

    private boolean occupe;

    public Place(){
    }

    public Place(String id, boolean occupe){
        this.id = id;
        this.occupe = occupe;
    }

    //getter et setter


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isOccupe() {
        return occupe;
    }

    public void setOccupe(boolean occupe) {
        this.occupe = occupe;
    }
}
