package com.sumit.microservice.customermanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer registor(Customer customer){

        customerRepository.save(customer);

        return  customer;
    }

    public String login(CustomerCredential customerCredential){
        Customer customer  = customerRepository.findCustomerByEmail(customerCredential.getEmail());

        if(
                (customer != null) &
                (customer.getPassword().equals(customerCredential.getPassword()))
        )
        {
            return "login successful";
        }

        return "please check the credential";

    }

//    public Customer updateEmail(String newEmail,Long id){
//        Customer customer = customerRepository.findCustomerByCustomerId(id);
//
//        customer.upadte
//
//    }


}
