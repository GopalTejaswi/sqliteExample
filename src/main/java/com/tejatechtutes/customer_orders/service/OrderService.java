package com.tejatechtutes.customer_orders.service;

import com.tejatechtutes.customer_orders.model.Customer;
import com.tejatechtutes.customer_orders.model.Order;
import com.tejatechtutes.customer_orders.repository.CustomerRepository;
import com.tejatechtutes.customer_orders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Teja K
 */
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    public List<Order> getAllOrders() {
        List<Order> allOrders = orderRepository.findAll();
        return allOrders;
    }

    public Order saveOrder(Order order) {
        Order savedOrders = orderRepository.save(order);
        return savedOrders;
    }

    public String deleteOrderById(Long orderId) {
        Optional<Order> orderOptional = orderRepository.findById(orderId);
        if (orderOptional.isPresent()) {
            orderRepository.deleteById(orderId);
            return "order with ID " + orderId + " deleted successfully";

        } else {
            throw new RuntimeException("order with ID " + orderId + " not found.");
        }

    }
}
