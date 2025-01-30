package com.zup.ECommerce.Sistema.E_Commerce.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.br.CPF;

@Entity

public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome não pode ser em branco.")
    private String clientName;

    @CPF(message = "O CPF deve ser válido.")
    @Column(unique = true)
    private String cpf;

    @Email(message = "O Email deve ser válido.")
    @Column(unique = true)
    private String email;

    public ClientEntity() {}

    public ClientEntity(String clientName, String cpf, String email) {
        this.clientName = clientName;
        this.cpf = cpf;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String name) {
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
