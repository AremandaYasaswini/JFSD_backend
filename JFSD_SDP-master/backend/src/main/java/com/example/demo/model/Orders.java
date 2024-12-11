package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String productPrice;
    private String productImage;
    private String customerName;
    private String customerAddress;
    private String customerCity;
    private String customerPostalCode;
    private String paymentMethod;
    private int quantity;
    private String unit;
    private double totalPrice;
    private String status = "Pending";
}
