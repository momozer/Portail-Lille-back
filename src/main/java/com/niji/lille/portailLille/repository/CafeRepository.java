package com.niji.lille.portailLille.repository;

import com.niji.lille.portailLille.entity.Cafe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CafeRepository extends MongoRepository<Cafe, String> {

    Cafe getLien();
    Cafe getImage();
}
