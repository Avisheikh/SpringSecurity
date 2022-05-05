package com.example.authorities.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }

    @GetMapping("/ciao")
    public String ciao(){
        return "Ciao!";
    }

    @GetMapping("/hola")
    public String hola(){
        return "Hola!";
    }

    @PostMapping("/a")
    public String postEndpointA(){
        return "Works!";
    }

    @GetMapping("/a")
    public String getEndpointA(){
        return "Works!";
    }

    @GetMapping("/a/b")
    public String getEndpointB(){
        return "Works!";
    }

    @GetMapping("/a/b/c")
    public String getEndpointC(){
        return "Works!";
    }

    @GetMapping("/video/{country}/{language}")
    public String video(@PathVariable String country,
                        @PathVariable String language){
        return "Video allowed for " + country + " " + language;
    }


}
