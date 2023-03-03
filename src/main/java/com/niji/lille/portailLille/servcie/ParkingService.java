package com.niji.lille.portailLille.servcie;

import com.niji.lille.portailLille.entity.Parking;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ParkingService {

    /**Affiche les places de parking
     * @return toutes les places de parking
     */
    List<Parking> findAll();

    /**
     * Affiche le parking par son id
     * @param id parking
     * @return le parking
     */
    Parking getParkingById(String id);

    /**
     * Crée un parking
     * @param entity le parking et ses entités
     * @returnle parking créé
     */
    Parking createParking(Parking entity);

    /**
     * Modifie le parking
     *
     */
    Parking updateParking(String id, Parking entity);

    /**
     * Supprime le parking
     * @Param id du parking
     */

    void deleteParking(String id);
}
