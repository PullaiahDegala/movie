package com.mouritech.bookmyshow.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.bookmyshow.movie.dao.CustomerRepository;
import com.mouritech.bookmyshow.movie.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;

	@Override
	public Customer createData(Customer customer) {
		   return customerRepository.save(customer);
	}

//	@Override
//	public Customer updatedData(Customer customer) {
//		return customerRepository.save(customer);
//	}

   
}
