package com.zup.ECommerce.Sistema.E_Commerce.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record ProductRequestDTO(
        @NotBlank(message = "O nome do produto não pode ser em branco.") String productName,
        @Positive(message = "O preço deve ser maior que zero.") double price,
        @Min(value = 0, message = "A quantidade deve ser maior ou igual a zero.") int quantity)
{}
