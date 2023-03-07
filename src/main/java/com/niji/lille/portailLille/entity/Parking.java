package com.niji.lille.portailLille.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Parking {
    @Id
    private String id;

    private String name;

    private List<Place> places;

    private Integer placeLibre;

    private Integer placeMax = 6;

    public Parking(String id, String name, List<Place> places, Integer placeLibre) {
        this.id = id;
        this.name = name;
        this.places = places;
        this.placeLibre = placeLibre;
    }
    public Parking() {}
    // getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public Integer getPlaceLibre() {
        return placeLibre;
    }

    public void setPlaceLibre(Integer placeLibre) {
        this.placeLibre = placeLibre;
    }

    public Integer getPlaceMax(){
        return placeMax;
    }
}
