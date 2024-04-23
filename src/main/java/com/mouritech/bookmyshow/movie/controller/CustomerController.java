package com.mouritech.bookmyshow.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.bookmyshow.movie.model.Customer;
import com.mouritech.bookmyshow.movie.service.CustomerService;

@RestController
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;
    
    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) 
    {
        Customer savedCustomer = customerService.createData(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }
    
//    @PutMapping("/updated")
//    public ResponseEntity<Customer> updatedData(@RequestBody  Customer customer)
//    {
//    	Customer response =customerService.updatedData(customer);
//    	return new ResponseEntity<Customer>(response, HttpStatus.OK);
//    }
}
