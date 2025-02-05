package com.zup.ECommerce.Sistema.E_Commerce.controller;

import com.zup.ECommerce.Sistema.E_Commerce.dtos.ClientRequestDTO;
import com.zup.ECommerce.Sistema.E_Commerce.dtos.ClientResponseDTO;
import com.zup.ECommerce.Sistema.E_Commerce.service.ClientService;
import jakarta.validation.Valid;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<ClientResponseDTO> addClient(@Valid @RequestBody ClientRequestDTO clientRequestDTO) {
        ClientResponseDTO savedClient = clientService.addClient(clientRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedClient);
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<ClientResponseDTO> getClientByCpf(@PathVariable @CPF(message = "CPF inválido.") String cpf) {
       return ResponseEntity.ok(clientService.getClientByCpf(cpf));
    }

    @PutMapping("/{cpf}")
    public ResponseEntity<ClientResponseDTO> updateClient(@PathVariable String cpf, @Valid @RequestBody ClientRequestDTO clientRequestDTO) {
        return ResponseEntity.ok(clientService.updateClient(cpf, clientRequestDTO));
    }
}
