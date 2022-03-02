package com.sumit.microservice.customermanager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Customer findCustomerByEmail(String email);
    Customer findCustomerByCustomerId(Long customerId);

}
