package com.starktony.learnspringboot.rest;

import com.starktony.learnspringboot.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping("/")
    String Home(){
        String learn = "bean scope";
        return "This is a spring boot app to learn about "+ learn;
    }

    //private field for dependencies
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public Controllers(@Qualifier("cricketCoach") Coach myCoach, @Qualifier("cricketCoach") Coach anotherCoach){
        System.out.println("In constructor : "+getClass().getSimpleName());
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/getworkout")
    public  String workout(){
        return myCoach.getDailyWorkOut();
    }

    @GetMapping("/check1")
    public  String check1(){
        return "Comparing beans with singleton scope: "+(anotherCoach==myCoach);//this will give false if scope is prototype and true if scope is singleton
    }
}