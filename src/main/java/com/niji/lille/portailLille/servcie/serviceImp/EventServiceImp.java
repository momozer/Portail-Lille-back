package com.niji.lille.portailLille.servcie.serviceImp;

import com.niji.lille.portailLille.entity.Category;
import com.niji.lille.portailLille.entity.Event;
import com.niji.lille.portailLille.repository.EventRepository;
import com.niji.lille.portailLille.servcie.EventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

public class EventServiceImp implements EventService {

    private static final Logger logger = LoggerFactory.getLogger(EventService.class);
    @Autowired
    private final EventRepository eventRepository;

    public EventServiceImp(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> findALl() {
        logger.info("Affiche l'ensemble des events existants");
        return eventRepository.findAll();
    }

    @Override
    public Event save(Event entity) {
        logger.info("Sauvegarde, enregistrement d'un nouvel event en fonction des renseignements fournis par " +
                "l'utilisateur dans le body " + entity);
        return eventRepository.save(entity);
    }

    @Override
    public List<Event> findByDateTime(LocalDate dateTime) {
        logger.info("Recherche d'un event par dateDebut renseignée: " + dateTime);
        return eventRepository.findByDateTime(dateTime);
    }


    @Override
    public List<Event> findByCategory(Category category) {
        logger.info("Recherche d'un event par la categorie renseignée: " + category);
        return eventRepository.findByCategory(category);
    }

    @Override
    public Event findById(String id) {
        logger.info("Recherche d'un event par son id: " + id);
        return eventRepository.findById(id).orElseThrow(() -> {
            logger.warn("l'id: " + id + " est invalide");
            return new ResponseStatusException((HttpStatus.NOT_FOUND));
        });
    }

    @Override
    public Event modifierById(String id, Event entity) {
        logger.info("Modification d'un event avec les elements suivants :" + entity);
        Event event = this.findById(id);
        if (entity.getCategory() == null) {
            event.setCategory(event.getCategory());
        } else event.setCategory(entity.getCategory());

        if (entity.getDateTime() == null) {
            event.setDateTime(event.getDateTime());
        } else event.setDateTime((entity.getDateTime()));

        if (entity.getLieu() == null) {
            event.setLieu(event.getLieu());
        } else event.setLieu(entity.getLieu());

        if (entity.getCommentaire() == null) {
            event.setCommentaire(event.getCommentaire());
        } else event.setCommentaire(entity.getCommentaire());

        return this.save(event);
    }

    @Override
    public void deleteById(String id) {
        logger.info("l'event portant l'id:" + id + " a été supprimé");
        eventRepository.deleteById(id);
    }

}
