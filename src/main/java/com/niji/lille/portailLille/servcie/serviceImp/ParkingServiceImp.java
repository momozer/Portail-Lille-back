package com.niji.lille.portailLille.servcie.serviceImp;

import com.niji.lille.portailLille.entity.Parking;
import com.niji.lille.portailLille.repository.ParkingRepository;
import com.niji.lille.portailLille.servcie.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ParkingServiceImp implements ParkingService {
    @Autowired
    private ParkingRepository parkingRepository;

    public ParkingServiceImp(ParkingRepository parkingRepository) {
    }

    @Override
    public List<Parking> findAll() {
        return parkingRepository.findAll();
    }

    @Override
    public Parking getParkingById(String id) {
        return parkingRepository.findById(id).orElse(null);
    }

    @Override
    public Parking createParking(Parking entity) {
        return parkingRepository.save(entity);
    }

    @Override
    public Parking updateParking(String id, Parking entity) {
        Parking existingParking = parkingRepository.findById(id).orElse(null);
        if (existingParking != null) {
            existingParking.setName(entity.getName());
            existingParking.setPlaces(entity.getPlaces());
            return parkingRepository.save(existingParking);
        } else {
            return null;
        }
    }

    @Override
    public void deleteParking(String id) {
        parkingRepository.deleteById(id);
    }
}
