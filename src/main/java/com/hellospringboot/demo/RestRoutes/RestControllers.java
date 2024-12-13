package com.hellospringboot.demo.RestRoutes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

 //accessing the custom application properties
   @Value("${company.name}")
    private String companyName;

    @Value("${company.ceo}")
    private String companyCeo;

    //new endpoint to return the propertied value
    @GetMapping("/company")
    public  String Company(){
        return "Company:- "+companyName+" CEO:- "+companyCeo;
    }

    @GetMapping("/")
    public String Home() {
        return "Hello from spring home page!!!";
    }

    @GetMapping("/vb")
    public String vb() {
        return "Hello from Vaibhav!!";
    }

    @GetMapping("/sb")
    public String sm() {
        return "Hello from sumit!!";
    }


}
