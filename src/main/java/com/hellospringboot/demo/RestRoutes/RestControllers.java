package com.hellospringboot.demo.RestRoutes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

@GetMapping("/")
    public  String Home(){
    return "Hello from spring bofefot!!!";
}
}
