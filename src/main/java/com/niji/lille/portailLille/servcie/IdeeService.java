package com.niji.lille.portailLille.servcie;

import com.niji.lille.portailLille.entity.Idee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IdeeService {
    /**
     * affiche toutes les idees
     * @return liste d'idee
     */
    List<Idee> findAll();

    /**
     * crée une nouvelle idée
     * @param entity creation d'une idee par l'user
     * @return la nouvelle idee
     */
    Idee save(Idee entity);

    /**
     * cherche et affiche une idee par son id
     * @param id de l'idee à chercher
     * @return l'idee qui a l'id
     */
    Idee findById(String id);

    /**
     * cherche et affiche une idee par son titre
     * @param titre de l'idee à chercher et affciher
     * @return l'idee qui a le titre
     */
    Idee findByTitre(String titre);

    /**
     * mdoifie l'idee qui a l'id
     * @param id de l'idee à modifier
     * @return l'idee modifier
     */
    Idee modifierById(String id);

    /**
     * supprimer l'idée par id
     * @param id de l'idee à supprimer
     */
    void deleteById(String id);
}
