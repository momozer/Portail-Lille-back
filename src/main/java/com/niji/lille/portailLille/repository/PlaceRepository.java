package com.niji.lille.portailLille.repository;

import com.niji.lille.portailLille.entity.Place;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlaceRepository extends MongoRepository<Place, String> {
}
