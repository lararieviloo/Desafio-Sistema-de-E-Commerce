package com.zup.ECommerce.Sistema.E_Commerce.repository;

import com.zup.ECommerce.Sistema.E_Commerce.models.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<ClientEntity, String> {
    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);
    Optional<ClientEntity> findByCpf(String cpf);
    Optional<Object> findByEmail(String email);
}
