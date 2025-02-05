package com.zup.ECommerce.Sistema.E_Commerce.service;


import com.zup.ECommerce.Sistema.E_Commerce.dtos.ClientRequestDTO;
import com.zup.ECommerce.Sistema.E_Commerce.dtos.ClientResponseDTO;
import com.zup.ECommerce.Sistema.E_Commerce.exceptions.ClientAlreadyExistsException;
import com.zup.ECommerce.Sistema.E_Commerce.exceptions.ClientNotFoundException;
import com.zup.ECommerce.Sistema.E_Commerce.models.ClientEntity;
import com.zup.ECommerce.Sistema.E_Commerce.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;


    private ClientEntity mapToEntity(ClientRequestDTO clientRequestDTO) {

        return new ClientEntity(clientRequestDTO.clientName(),
                clientRequestDTO.cpf(),
                clientRequestDTO.email());
    }

    private ClientResponseDTO mapToResponse(ClientEntity clientEntity) {
        return new ClientResponseDTO(clientEntity.getId(),
                clientEntity.getClientName(),
                clientEntity.getCpf(),
                clientEntity.getEmail());
    }

    @Override
    public ClientResponseDTO addClient(ClientRequestDTO clientRequestDTO) {
        String cpf = clientRequestDTO.cpf();
        if (clientRepository.existsByCpf(cpf)) {
            throw new ClientAlreadyExistsException("O CPF informado já existe.");
        }

        String email = clientRequestDTO.email();
        if (clientRepository.existsByEmail(email)) {
            throw new ClientAlreadyExistsException("O email informado já existe.");
        }

        ClientEntity clientEntity = mapToEntity(clientRequestDTO);
        clientRepository.save(clientEntity);
        return mapToResponse(clientEntity);
    }

    @Override
    public ClientResponseDTO getClientByCpf(String cpf) {
        ClientEntity clientEntity = clientRepository.findByCpf(cpf)
                .orElseThrow(() -> new ClientNotFoundException("Não foi possível achar o cliente com o CPF informado."));
        return mapToResponse(clientEntity);
    }

    @Override
    public ClientResponseDTO updateClient(String cpf, ClientRequestDTO clientRequestDTO) {
        ClientEntity clientEntity = clientRepository.findByCpf(cpf)
                .orElseThrow(() -> new ClientNotFoundException("Não foi possível achar o cliente com o CPF informado."));
        clientEntity.setClientName(clientRequestDTO.clientName());
        clientEntity.setCpf(clientRequestDTO.cpf());
        clientEntity.setEmail(clientRequestDTO.email());
        clientRepository.save(clientEntity);
        return mapToResponse(clientEntity);
    }

    @Override
    public List<ClientResponseDTO> getAllClients() {
        return clientRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }
}
