package com.starktony.learnspringboot.common;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{

    public  CricketCoach(){
        System.out.println("In constructor : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "practice cover drive and pull shot for 1 hour each";
    }
}
