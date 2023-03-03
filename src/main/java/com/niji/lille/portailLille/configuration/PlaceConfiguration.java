package com.niji.lille.portailLille.configuration;

import com.niji.lille.portailLille.repository.PlaceRepository;
import com.niji.lille.portailLille.servcie.PlaceService;
import com.niji.lille.portailLille.servcie.serviceImp.PlaceServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlaceConfiguration {
    @Bean
    public PlaceService placeService (PlaceRepository placeRepository){
        return new PlaceServiceImp(placeRepository);
    }
}
