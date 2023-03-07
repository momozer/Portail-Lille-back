package com.niji.lille.portailLille.repository;

import com.niji.lille.portailLille.entity.Idee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IdeeRepository extends MongoRepository<Idee, String> {

    List<Idee> findByTitre(String titre);


}
