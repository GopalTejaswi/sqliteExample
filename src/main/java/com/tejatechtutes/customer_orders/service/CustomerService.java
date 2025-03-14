package com.tejatechtutes.customer_orders.service;

import com.tejatechtutes.customer_orders.model.Customer;
import com.tejatechtutes.customer_orders.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Teja K
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    /*public List<Customer> saveCustomers(List<Customer> customers) {
        return customerRepository.saveAll(customers);
    }*/
}
