package com.niji.lille.portailLille.repository;

import com.niji.lille.portailLille.entity.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {

}
