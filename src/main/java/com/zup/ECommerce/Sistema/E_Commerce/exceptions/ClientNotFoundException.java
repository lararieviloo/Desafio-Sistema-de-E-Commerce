package com.zup.ECommerce.Sistema.E_Commerce.exceptions;

public class ClientNotFoundException extends RuntimeException{
    public ClientNotFoundException(String message) {
        super(message);
    }
}
