package com.niji.lille.portailLille.servcie.serviceImp;

import com.niji.lille.portailLille.entity.Place;
import com.niji.lille.portailLille.repository.PlaceRepository;
import com.niji.lille.portailLille.servcie.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PlaceServiceImp implements PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    public PlaceServiceImp(PlaceRepository placeRepository) {
    }

    @Override
    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }

    @Override
    public Place getPlaceById(String id) {
        return placeRepository.findById(id).orElse(null);
    }

    @Override
    public Place createPlace(Place entity) {
        return placeRepository.save(entity);
    }

    @Override
    public Place updatePlace(String id, Place entity) {
        Place existingPlace = placeRepository.findById(id).orElse(null);
        if (existingPlace != null) {
            existingPlace.setNom(entity.getNom());
            existingPlace.setOccupe(entity.isOccupe());
            return placeRepository.save(existingPlace);
        } else {
            return null;
        }
    }

    @Override
    public void deletePlace(String id) {
        placeRepository.deleteById(id);
    }
}
