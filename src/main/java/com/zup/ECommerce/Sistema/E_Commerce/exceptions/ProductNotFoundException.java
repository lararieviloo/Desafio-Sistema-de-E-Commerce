package com.zup.ECommerce.Sistema.E_Commerce.exceptions;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
