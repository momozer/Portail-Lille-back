package com.niji.lille.portailLille.servcie;

import com.niji.lille.portailLille.entity.Idee;
import org.springframework.beans.factory.annotation.Autowired;
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
     * supprimer l'idée par id
     * @param id de l'idee à supprimer
     */
    void deleteById(String id);
}
