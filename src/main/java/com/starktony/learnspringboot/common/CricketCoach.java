package com.starktony.learnspringboot.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public  CricketCoach(){
        System.out.println("In constructor : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "practice cover drive and pull shot for 1 hour each";
    }
}
