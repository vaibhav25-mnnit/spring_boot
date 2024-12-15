package com.starktony.learnspringboot.rest;

import com.starktony.learnspringboot.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping("/")
    String Home(){
        String learn = "Component scanning";
        return "This is a spring boot app to learn about "+ learn;
    }

    //private field for dependencys
    private Coach myCoach;

    @Autowired
    public Controllers(Coach argCoach){
        myCoach = argCoach;
    }

    @GetMapping("/getworkout")
    public  String workout(){
        return myCoach.getDailyWorkOut();
    }
}
/*
    what is happening behind the scenes in constructor injection
        Coach argCoach = new CricketCoach();
        Controller controller = new Controller(argCoach);
 */