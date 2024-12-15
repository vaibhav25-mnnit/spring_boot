package com.starktony.learnspringboot.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "Bowl 2 overs with tennis ball";
    }

}
