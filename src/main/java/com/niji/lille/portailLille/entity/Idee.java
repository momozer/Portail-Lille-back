package com.niji.lille.portailLille.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Idee {
    @Id
    private String id;
    private Integer vote;
    private String titre;
    private String description;


//constructors:
    public Idee() {
    }

    public Idee(String id, Integer vote, String titre, String description) {
        this.id = id;
        this.vote = vote;
        this.titre = titre;
        this.description = description;
    }

    //getter et setter:


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVote() {
        return vote;
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
