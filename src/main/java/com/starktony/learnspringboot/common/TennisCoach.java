package com.starktony.learnspringboot.common;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements  Coach{

    public TennisCoach(){
        System.out.println("In constructor : "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice service using the upper hand gesture for 30 minutes";
    }
}
