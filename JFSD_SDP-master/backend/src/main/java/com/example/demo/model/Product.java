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
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Change from int to Long

    private String name;
    private String price;
    private String image;
    private String category;
    private int quantity;
    private String unit;

    public Product(String name, String price, String category, String imagePath) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.image = imagePath;
    }
}
