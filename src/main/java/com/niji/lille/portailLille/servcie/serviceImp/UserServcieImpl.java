package com.niji.lille.portailLille.servcie.serviceImp;

import com.niji.lille.portailLille.entity.Users;
import com.niji.lille.portailLille.repository.UserRepository;
import com.niji.lille.portailLille.servcie.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class UserServcieImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServcieImpl.class);

    private final UserRepository userRepository;

    public UserServcieImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Users> findAll() {
        logger.info("Récupération de tous les users existants");
        return userRepository.findAll();
    }

    @Override
    public Users save(Users entity) {
        logger.info("Sauvegarde, enregistrement d'un nouvel user en fonction des renseignements fournis" +
                "par l'utilisateur dans le body: " + entity);
        return userRepository.save(entity);
    }

    @Override
    public Users findById(String id) {
        logger.info("Recherche d'un user avec son id : "+id);
        return userRepository.findById(id).orElseThrow(() ->{
            logger.warn("l'id : " + id + " est invalide");
            return new ResponseStatusException(HttpStatus.NOT_FOUND);
        });
    }

    @Override
    public List<Users> findByNom(String nom) {
        logger.info("recherche un ou plusieur users avec le nom: "+nom);
        return userRepository.findByNom(nom);
    }

    @Override
    public List<Users> findByPrenom(String prenom) {
        logger.info("recherche un ou plusieurs user avec le prenom: "+prenom);
        return userRepository.findByPrenom(prenom);
    }


    @Override
    public void deleteById(String id) {
        logger.info("supprime le user avec l'id : "+id);
        userRepository.deleteById(id);
    }
}
