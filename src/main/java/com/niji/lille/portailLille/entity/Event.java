package com.niji.lille.portailLille.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private String id;
    private LocalDate dateDébut;
    private LocalDate dateFin;
    private Category category;
    private String lieu;
    private String commentaire;

    @DBRef
    private Users participant;
    @DBRef
    private Users organisateur;
}
