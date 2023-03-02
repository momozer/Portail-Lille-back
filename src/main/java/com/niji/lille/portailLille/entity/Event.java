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
}
