package com.starktony.learnspringboot.rest;

import com.starktony.learnspringboot.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping("/")
    String Home(){
        String learn = "Component scanning";
        return "This is a spring boot app to learn about "+ learn;
    }

    //private field for dependencies
    private Coach myCoach;

    @Autowired
    public Controllers(Coach myCoach){
        this.myCoach = myCoach;
    }

    @GetMapping("/getworkout")
    public  String workout(){
        return myCoach.getDailyWorkOut();
    }
}
/*
    -->add the '@Qualifier' annotation with beans name with first letter as small to specify which bean to use

    -->or if you don't want to do that you can use '@Primary' annotation which will create that bean if not mentioned with '@Qualifier'

    -->ALso the '@Primary' annotation can only be used for once among the similar classes

    -->priority of @Qualifier >> @primary
 */