package com.niji.lille.portailLille.servcie;

import com.niji.lille.portailLille.entity.Place;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlaceService {
    /**
     * Affiche toutes les places de parking
     * @return toutes les places de parking
     */
    List<Place> getAllPlaces();

    /**
     * Affiche une place avec son id
     * @param id de la place
     * @return la place portant l'id
     */
    Place getPlaceById(String id);

    /**
     * Permet de créer une place
     * @param entity correspond à la place créée
     * @return la place créée
     */
    Place createPlace(Place entity);

    /**
     * Permet de modifier les parametres d'une place avec son id
     * @param id de la place à modifier
     * @param entity correspond aux modifications apportées par l'utilisateur à la place id
     * @return la place modifiée
     */
    Place updatePlace(String id, Place entity);

    /**
     * Permet de supprimer une place à l'aide de son id
     * @param id de la place à supprimer
     */
    void deletePlace(String id);
}
