package com.tejatechtutes.customer_orders.repository;

import com.tejatechtutes.customer_orders.model.Order;
import com.tejatechtutes.customer_orders.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Teja K
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
