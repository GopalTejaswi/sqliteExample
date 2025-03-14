package com.tejatechtutes.customer_orders.repository;

import com.tejatechtutes.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Teja K
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
