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
        String learn = "Component scanning";
        return "This is a spring boot app to learn about "+ learn;
    }

    //private field for dependencies
    private Coach myCoach;

    @Autowired
    public Controllers(@Qualifier("cricketCoach") Coach myCoach){
        System.out.println("In constructor : "+getClass().getSimpleName());
        this.myCoach = myCoach;
    }

    @GetMapping("/getworkout")
    public  String workout(){
        return myCoach.getDailyWorkOut();
    }
}
/*
    -->by default all the beans are created at the startup of the app

    -->we can restrict the bean creation by using the '@Lazy' at the top of the app, this will allow the creation of bean only when that particular bean is required.

    --->also we can make all the beans lazy by updating the application.properties file to 'spring.main.lazy-initialization-true'
 */