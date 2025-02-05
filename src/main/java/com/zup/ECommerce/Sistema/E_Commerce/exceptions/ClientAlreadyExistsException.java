package com.zup.ECommerce.Sistema.E_Commerce.exceptions;

public class ClientAlreadyExistsException extends RuntimeException{
    public ClientAlreadyExistsException(String message) {
        super(message);
    }
}
