package com.niji.lille.portailLille.servcie;

import com.niji.lille.portailLille.entity.PacketCafe;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PacketCafeService {

    /**
     * affiche l'ensemble des packets de caffe
     * @return les packets de cafe
     */
    List<PacketCafe> findAll();

    /**
     * affiche les packets de cafe par id
     * @param id du packet de cafe
     * @return le packet
     */
    PacketCafe findById(String id);

    /**
     * Enregistre un packet de cafe
     * @param entity enregistrement du packet par l'utilisateur
     * @return le nouveau packet
     */
    PacketCafe save(PacketCafe entity);

    /**
     * supprime un packet
     * @param id du packet
     */
    void deleteById(String id);


}
