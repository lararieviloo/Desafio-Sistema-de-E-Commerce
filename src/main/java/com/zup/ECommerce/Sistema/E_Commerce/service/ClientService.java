package com.zup.ECommerce.Sistema.E_Commerce.service;

import com.zup.ECommerce.Sistema.E_Commerce.models.Client;
import com.zup.ECommerce.Sistema.E_Commerce.dtos.ClientRequestDTO;


public interface ClientService {
    Client addClient(ClientRequestDTO clientRequestDTO);
    Client getClientByCpf(String cpf);
    Client updateClient(String cpf, ClientRequestDTO clientRequestDTO);
}
