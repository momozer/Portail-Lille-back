package com.niji.lille.portailLille.controller;

import com.niji.lille.portailLille.entity.Parking;
import com.niji.lille.portailLille.servcie.ParkingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/parking")
public class ParkingController {

    private final ParkingService parkingService;

    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }
    @GetMapping("")
    public List<Parking> findAll() {
        return parkingService.findAll();
    }
    @GetMapping("{id}")
    public Parking getParkingById(@PathVariable String id) {
        return parkingService.getParkingById(id);
    }
    @PostMapping("")
    public Parking createParking(@RequestBody Parking entity) {
        return parkingService.createParking(entity);
    }
    @PatchMapping("{id}")
    public Parking updateParking(@PathVariable String id, @RequestBody Parking entity) {
        return parkingService.updateParking(id, entity);
    }

    @DeleteMapping("{id}")
    public void deleteParking(@PathVariable String id) {
        parkingService.deleteParking(id);
    }
}
