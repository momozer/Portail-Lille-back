package com.niji.lille.portailLille.configuration;

import com.niji.lille.portailLille.repository.UserRepository;
import com.niji.lille.portailLille.servcie.UserService;
import com.niji.lille.portailLille.servcie.serviceImp.UserServcieImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsersConfiguration {
    @Bean
    public UserService userService(UserRepository userRepository){
        return new UserServcieImpl(userRepository);
    }
}
