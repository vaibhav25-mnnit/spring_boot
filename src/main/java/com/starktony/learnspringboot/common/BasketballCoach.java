package com.starktony.learnspringboot.common;

public class BasketballCoach implements Coach{

    public  BasketballCoach(){
        System.out.println("In constructor : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Practice long shot for 2 hours";
    }

}
