package com.zup.ECommerce.Sistema.E_Commerce.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public record ClientRequestDTO(
        @NotBlank(message = "O nome não pode ser em branco.") String clientName,

        @CPF(message = "O CPF deve ser válido.") String cpf,

        @Email(message = "O Email deve ser válido.") String email
)
{}