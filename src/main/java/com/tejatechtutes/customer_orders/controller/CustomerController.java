package com.tejatechtutes.customer_orders.controller;

import com.tejatechtutes.customer_orders.model.Customer;
import com.tejatechtutes.customer_orders.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Teja K
 */
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "getAllCustomers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @PostMapping(value = "/saveCustomer")
    public Customer saveCustomer(@Valid @RequestBody Customer customer) {
        System.out.println("Received customer: " + customer.toString());
        Customer response = customerService.saveCustomer(customer);
        return response;
    }

    /*@PostMapping(value = "saveCustomers")
    public ResponseEntity<List<Customer>> saveCustomers(@RequestBody List<Customer> customers) {
        return (ResponseEntity<List<Customer>>) customerService.saveCustomers(customers);
    }*/
}
