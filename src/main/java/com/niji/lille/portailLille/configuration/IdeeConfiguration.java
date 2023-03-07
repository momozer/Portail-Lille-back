package com.niji.lille.portailLille.configuration;

import com.niji.lille.portailLille.repository.IdeeRepository;
import com.niji.lille.portailLille.servcie.IdeeService;
import com.niji.lille.portailLille.servcie.serviceImp.IdeeServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IdeeConfiguration {

    @Bean
    public IdeeService ideeService(IdeeRepository ideeRepository){
        return new IdeeServiceImp(ideeRepository);
    }
}
