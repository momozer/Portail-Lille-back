package com.niji.lille.portailLille.servcie;

import com.niji.lille.portailLille.entity.Cafe;
import org.springframework.stereotype.Service;

@Service
public interface CafeService {
    /**
     * retourne le lien pour la cagnotte
     * @return le lien
     */
    Cafe getLien();

    /**
     * retourne l'image d'illustration de la page cafe
     * @return image illustration cafe
     */
    Cafe getImage();
}
