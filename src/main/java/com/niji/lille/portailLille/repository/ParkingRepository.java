package com.niji.lille.portailLille.repository;

import com.niji.lille.portailLille.entity.Parking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParkingRepository extends MongoRepository<Parking, String> {


}
