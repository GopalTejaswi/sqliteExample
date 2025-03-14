package com.tejatechtutes.customer_orders.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * @author Teja K
 */

@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Product name is required")
    @Column(nullable = false)
    private String product;

    @NotNull(message = "Quantity is required")
    @Column(nullable = false)
    private int quantity;

    @NotNull(message = "Price is required")
    @Column(nullable = false)
    private Double price;


    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false) //customer_id is FK
    @JsonIgnore
    private Customer customer;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
