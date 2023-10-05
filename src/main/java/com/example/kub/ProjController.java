package com.example.kub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ProjController {

    @GetMapping("/hello")
    public String hello(){
        return "HELLO";
    }

    @GetMapping("/healthz")
    public String live(){
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        if(randomNumber> 5){
            throw new RuntimeException();
        }
        return "UP";
    }

    @GetMapping("/kub-ready")
    public String ready() throws InterruptedException{
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        Thread.sleep(10000);
        return "Ready";
    }
}
