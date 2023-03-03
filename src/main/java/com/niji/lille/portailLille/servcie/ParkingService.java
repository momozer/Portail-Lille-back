package com.niji.lille.portailLille.servcie;

import com.niji.lille.portailLille.entity.Parking;

import java.util.List;

public interface ParkingService {

    /**Affiche les places de parking
     * @return toutes les places de parking
     */
    List<Parking> findAll();

}
