package com.niji.lille.portailLille.configuration;

import com.niji.lille.portailLille.repository.ParkingRepository;
import com.niji.lille.portailLille.servcie.ParkingService;
import com.niji.lille.portailLille.servcie.serviceImp.ParkingServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParkingConfiguration {
    @Bean
    public ParkingService parkingService (ParkingRepository parkingRepository){
        return new ParkingServiceImp(parkingRepository);
    }
}
