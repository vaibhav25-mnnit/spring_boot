package com.starktony.learnspringboot.config;

import com.starktony.learnspringboot.common.BasketballCoach;
import com.starktony.learnspringboot.common.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach basketballCoach(){
        return new BasketballCoach();
    }
}
