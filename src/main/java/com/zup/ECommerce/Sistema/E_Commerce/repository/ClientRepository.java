package com.zup.ECommerce.Sistema.E_Commerce.repository;

import com.zup.ECommerce.Sistema.E_Commerce.models.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, String> {
}
