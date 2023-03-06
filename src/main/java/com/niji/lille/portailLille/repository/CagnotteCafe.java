package com.niji.lille.portailLille.repository;

import com.niji.lille.portailLille.entity.CafeCagnotte;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CagnotteCafe extends MongoRepository<CafeCagnotte, String> {
}
