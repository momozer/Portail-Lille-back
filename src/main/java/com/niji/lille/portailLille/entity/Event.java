package com.niji.lille.portailLille.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.SimpleTimeZone;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private String id;
    private LocalDate dateDebut;
    private Integer heure;
    private Category category;
    private String lieu;
    private String commentaire;

    @DBRef
    private Users participant;
    @DBRef
    private Users organisateur;



    public Event(String id, LocalDate dateDebut, Integer heure, Category category, String lieu, String commentaire, Users participant, Users organisateur) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.heure = heure;
        this.category = category;
        this.lieu = lieu;
        this.commentaire = commentaire;
        this.participant = participant;
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

    public Users getParticipant() {
        return participant;
    }

    public void setParticipant(Users participant) {
        this.participant = participant;
    }

    public Users getOrganisateur() {
        return organisateur;
    }

    public void setOrganisateur(Users organisateur) {
        this.organisateur = organisateur;
    }
}
