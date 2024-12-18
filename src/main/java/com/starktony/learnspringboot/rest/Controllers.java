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
        String learn = "bean configuration";
        return "This is a spring boot app to learn about "+ learn;
    }

    //private field for dependencies
    private Coach myCoach;

    @Autowired
    public Controllers(@Qualifier("basketballCoach") Coach myCoach){
        System.out.println("In constructor : "+getClass().getSimpleName());
        this.myCoach = myCoach;
    }

    @GetMapping("/getworkout")
    public  String workout(){
        return myCoach.getDailyWorkOut();
    }

}