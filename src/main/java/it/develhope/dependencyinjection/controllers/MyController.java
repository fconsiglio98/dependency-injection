package it.develhope.dependencyinjection.controllers;

import it.develhope.dependencyinjection.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    public MyController(MyService myService) {
        System.out.println("MyController constructor has been called");
        this.myService = myService;
    }

    @GetMapping("/getName")
    public String getName(){
        return myService.getName();
    }

    @GetMapping
    public String welcomeMsg(){
        return "Welcome to our site!";
    }
}
