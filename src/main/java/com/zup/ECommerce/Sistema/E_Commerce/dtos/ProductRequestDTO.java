package com.zup.ECommerce.Sistema.E_Commerce.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class ProductRequestDTO {
        @NotBlank(message = "O nome do produto não pode ser em branco.")
        private String productName;

        @Positive(message = "O preço deve ser maior que zero.")
        private double price;

        @Min(value = 0, message = "A quantidade deve ser maior ou igual a zero.")
        private int quantity;

    public ProductRequestDTO() {}

    public ProductRequestDTO(String productName, double price, int quantity) {
        this.productName= productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductname(String productName) {
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
