package com.zup.ECommerce.Sistema.E_Commerce.service;

import com.zup.ECommerce.Sistema.E_Commerce.dtos.ClientResponseDTO;
import com.zup.ECommerce.Sistema.E_Commerce.dtos.ClientRequestDTO;

import java.util.List;


public interface ClientService {
    ClientResponseDTO addClient(ClientRequestDTO clientRequestDTO);
    ClientResponseDTO getClientByCpf(String cpf);
    ClientResponseDTO updateClient(String cpf, ClientRequestDTO clientRequestDTO);
    List<ClientResponseDTO> getAllClients();
}
