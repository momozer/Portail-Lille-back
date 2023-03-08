package com.niji.lille.portailLille.servcie;

import com.niji.lille.portailLille.entity.Category;
import com.niji.lille.portailLille.entity.Event;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface EventService {

    /**
     * Affiche tous les events
     * @return tous les events
     */
    List<Event> findALl();

    /**
     * Enregistre un nouveau event
     * @param entity les renseignements demandés pour créer un nouveau event
     * @return le nouveau Event créé
     */
    Event save (Event entity);

    /**Permet de chercher un event avec sa dateDebut
     * @param dateTime de l'event recherché
     * @return l'event commençant à la dateDebut
     */
    List<Event> findByDateTime(LocalDate dateTime);

    /**
     * Permet de cherche un event avec sa catégorie
     * @param category de l'event recherché
     * @return l'event avec qui a la category renseignée
     */
    List<Event> findByCategory(Category category);

    /**
     * Permet de chercher un event avec son id
     * @param id de l'event recherché
     * @return l'event recherché contenant l'id
     */
    Event findById(String id);

    /**
     * Permet de modifier un event
     * @param id de l'event
     * @param entity event body
     * @return modification de l'event
     */
    Event modifierById(String id, Event entity);

    /**
     * Permet de supprimer un event avec son id
     * @param id de l'event à supprimer
     */
    void deleteById(String id);




}
