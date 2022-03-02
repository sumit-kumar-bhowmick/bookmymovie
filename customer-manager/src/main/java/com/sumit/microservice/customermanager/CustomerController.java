package com.sumit.microservice.customermanager;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/registor")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer registor(@RequestBody Customer customer){
        customerService.registor(customer);
        return customer;
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String login(@RequestBody CustomerCredential customerCredential) {

        String other = customerService.login(customerCredential);

        return other;
    }


    @PostMapping("/update/email")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String updateEmail(@RequestBody Object temp){

        log.info("the email is {} ",temp);
        return  "hello";

    }

}
