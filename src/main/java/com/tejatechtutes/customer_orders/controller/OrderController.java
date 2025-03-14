package com.tejatechtutes.customer_orders.controller;

import com.tejatechtutes.customer_orders.model.Order;
import com.tejatechtutes.customer_orders.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Teja K
 */

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @GetMapping(value = "getAllOrders")
    List<Order> getAllOrders() {
        List<Order> allOrders = orderService.getAllOrders();
        return allOrders;
    }

    @PostMapping
    public Order saveOrder(@Valid @RequestBody Order order) {

        return orderService.saveOrder(order);
    }
}
