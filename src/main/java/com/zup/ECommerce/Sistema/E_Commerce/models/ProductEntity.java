package com.zup.ECommerce.Sistema.E_Commerce.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do produto não pode ser em branco.")
    @Column(unique = true)
    private String productName;

    @Positive(message = "O preço deve ser maior que zero.")
    private double price;

    @Min(value = 0, message = "A quantidade deve ser maior ou igual a zero.")
    private int quantity;

    public ProductEntity() {}

    public ProductEntity(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
