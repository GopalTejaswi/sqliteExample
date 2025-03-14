package com.tejatechtutes.customer_orders.repository;

import com.tejatechtutes.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Teja K
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
