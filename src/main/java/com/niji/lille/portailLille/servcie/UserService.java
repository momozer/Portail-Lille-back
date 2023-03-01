package com.niji.lille.portailLille.servcie;

import com.niji.lille.portailLille.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    /**
     *Affiche tous les users
     * @return tous les users
     */
    List<Users>findAll();

    /**
     * Enregistre un nouvel user
     * @param entity les renseignements demandés pour créer un nouvel user
     * @return le nouveau user créé
     */
    Users save(Users entity);

    /**
     * Permet de chercher un user avec son id
     * @param id du user cherché
     * @return l'user portant l'id
     */
    Users findById(String id);

    /**
     * Permet de supprimer un user avec son id
     * @param id de l'user à supprimer
     *
     */
    void deleteById(String id);
}
