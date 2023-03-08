package com.niji.lille.portailLille.repository;

import com.niji.lille.portailLille.entity.Category;
import com.niji.lille.portailLille.entity.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface EventRepository extends MongoRepository<Event, String> {
    List<Event> findByDateTime(LocalDate dateTime);
    List<Event> findByCategory(Category category);
}
