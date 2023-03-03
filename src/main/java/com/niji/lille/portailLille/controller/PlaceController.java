package com.niji.lille.portailLille.controller;

import com.niji.lille.portailLille.entity.Place;
import com.niji.lille.portailLille.servcie.PlaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/place")
public class PlaceController {
    private final PlaceService placeService;


    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping("")
    public List<Place> getAllPlaces() {
        return placeService.getAllPlaces();
    }

    @GetMapping("{id}")
    public Place getPlaceById(String id) {
        return placeService.getPlaceById(id);
    }

    @PostMapping("")
    public Place createPlace(Place entity) {
        return placeService.createPlace(entity);
    }

    @PatchMapping("{id}")
    public Place updatePlace(String id, Place entity) {
        return placeService.updatePlace(id, entity);
    }

    @DeleteMapping("{id}")
    public void deletePlace(String id) {
        placeService.deletePlace(id);
    }

}
