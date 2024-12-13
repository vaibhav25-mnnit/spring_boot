package com.starktony.learnspringboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    //private field for dependency
    private Coach myCoach;

    @Autowired
    public Controllers(Coach argCoach){
        myCoach = argCoach;
    }
    @GetMapping("/")
     public String Home(){
        return "Hello this is a spring boot app to learn java constructor injection";
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