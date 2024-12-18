package com.starktony.learnspringboot.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public  CricketCoach(){
        System.out.println("In constructor : "+getClass().getSimpleName());
    }

    @PostConstruct
    public void doSomethingAfterInitilise(){
        System.out.println("Do your stuff after the bean is set");
    }

    @PreDestroy
    public void dodoSomethingABeforeDestroy(){
        System.out.println("Do your stuff before the bean is destroyed");
    }
    @Override
    public String getDailyWorkOut() {
        return "practice cover drive and pull shot for 1 hour each";
    }
}
