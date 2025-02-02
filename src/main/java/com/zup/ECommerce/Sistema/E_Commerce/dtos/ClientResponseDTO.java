package com.zup.ECommerce.Sistema.E_Commerce.dtos;

public class ClientResponseDTO {
    private Long id;
    private String clientName;
    private String cpf;
    private String email;

    public ClientResponseDTO() {}

    public ClientResponseDTO(Long id, String clientName, String cpf, String email) {
        this.id = id;
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
