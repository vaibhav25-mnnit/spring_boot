package com.starktony.learnspringboot.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "practice cover drive and pull shot for 1 hour each";
    }
}
