package com.niji.lille.portailLille.configuration;

import com.niji.lille.portailLille.repository.CafeRepository;
import com.niji.lille.portailLille.servcie.CafeService;
import com.niji.lille.portailLille.servcie.serviceImp.CafeServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CafeConfiguration {

    @Bean
    public CafeService cafeService (CafeRepository cafeRepository){
        return new CafeServiceImp(cafeRepository);
    }
}
