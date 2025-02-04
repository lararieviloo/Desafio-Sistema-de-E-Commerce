package com.zup.ECommerce.Sistema.E_Commerce.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public class ClientRequestDTO {
        @NotBlank(message = "O nome não pode ser em branco.")
        private String clientName;

        @CPF(message = "O CPF deve ser válido.")
        private String cpf;

        @Email(message = "O Email deve ser válido.")
         private String email;

        public ClientRequestDTO() {}

    public ClientRequestDTO(String clientName, String cpf, String email) {
        this.clientName = clientName;
        this.cpf = cpf;
        this.email = email;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
