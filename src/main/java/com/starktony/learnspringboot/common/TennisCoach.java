package com.starktony.learnspringboot.common;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements  Coach{

    @Override
    public String getDailyWorkOut() {
        return "Practice service using the upper hand gesture for 30 minutes";
    }
}
