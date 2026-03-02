package com.louise.sistema_pedidos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")


public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private Double price;
    private Integer stockQuantity;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setPrice (Double price) {
        this.price = price;
    }

    public void setStockQuantity (Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
