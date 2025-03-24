package com.tejatechtutes.customer_orders.controller;

import com.tejatechtutes.customer_orders.model.Order;
import com.tejatechtutes.customer_orders.service.OrderService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Teja K
 */

//@Slf4j
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;
    @GetMapping(value = "getAllOrders")
    List<Order> getAllOrders() {
        List<Order> allOrders = orderService.getAllOrders();
        log.info("all orders from getAllOrders method:{}", allOrders );
        return allOrders;
    }

    @PostMapping(value = "saveOrder")
    public Order saveOrder(@Valid @RequestBody Order order) {
        log.info("Order request body:{}", order);
        return orderService.saveOrder(order);
    }
}
