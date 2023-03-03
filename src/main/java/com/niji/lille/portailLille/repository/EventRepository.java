package com.niji.lille.portailLille.repository;

import com.niji.lille.portailLille.entity.Category;
import com.niji.lille.portailLille.entity.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface EventRepository extends MongoRepository<Event, String> {
    List<Event> findByDateDebut(LocalDate dateDebut);
    List<Event> findByCategory(Category category);
}
