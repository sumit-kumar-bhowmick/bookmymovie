package com.sumit.microservices.paymentservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class paymentController {

    @GetMapping("/")
    public String payment(){

        return "Hello world";
    }

}
