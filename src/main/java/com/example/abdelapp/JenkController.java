package com.example.abdelapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkController {


    @GetMapping("/build")
    public String getInfo(){
        return "this is my project for : \n jenkins eval \n instructor : \n Emile ASTIH";
    }
}
