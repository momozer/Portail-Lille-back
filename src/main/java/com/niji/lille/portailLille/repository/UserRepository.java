package com.niji.lille.portailLille.repository;

import com.niji.lille.portailLille.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<Users, String> {

    List<Users> findByPrenom(String prenom);
    List<Users> findByNom(String nom);
}
