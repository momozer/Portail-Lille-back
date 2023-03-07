package com.niji.lille.portailLille.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.SimpleTimeZone;

@Data
@Document
public class Event {
    private String id;
    private LocalDate dateDebut; // A voir pour le typage
    private Integer heure; //A voir pour le typage
    private Category category;
    private String lieu;
    private String commentaire;

    @DBRef
    private List<Users> participants;
    @DBRef
    private Users organisateur;



    public Event(String id, LocalDate dateDebut, Integer heure, Category category, String lieu, String commentaire, List<Users> participants, Users organisateur) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.heure = heure;
        this.category = category;
        this.lieu = lieu;
        this.commentaire = commentaire;
        this.participants = participants;
        this.organisateur = organisateur;
    }
    public Event() {

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Integer getHeure() {
        return heure;
    }

    public void setHeure(Integer heure) {
        this.heure = heure;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public List<Users> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Users> participants) {
        this.participants = participants;
    }

    public Users getOrganisateur() {
        return organisateur;
    }

    public void setOrganisateur(Users organisateur) {
        this.organisateur = organisateur;
    }
}
