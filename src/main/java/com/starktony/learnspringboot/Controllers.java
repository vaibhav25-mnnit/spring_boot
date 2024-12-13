package com.starktony.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping("/")
    String Home(){
        String learn = "Nothing";
        return "This is a spring boot app to learn about "+ learn;
    }
}
