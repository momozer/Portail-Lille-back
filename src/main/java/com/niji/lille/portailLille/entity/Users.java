package com.niji.lille.portailLille.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private String username;
    private LocalDate dateNaissance;
    private String email;
    private String phone;
    private String motPasse;
}
