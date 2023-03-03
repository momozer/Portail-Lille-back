package com.niji.lille.portailLille.configuration;

import com.niji.lille.portailLille.repository.EventRepository;
import com.niji.lille.portailLille.servcie.EventService;
import com.niji.lille.portailLille.servcie.serviceImp.EventServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventConfiguration {
    @Bean
    public EventService eventService (EventRepository eventRepository){
        return new EventServiceImp(eventRepository);
    }
}
