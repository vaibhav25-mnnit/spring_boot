package com.starktony.learnspringboot.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Practice Goal keeping for 1 hour.";
    }
}
