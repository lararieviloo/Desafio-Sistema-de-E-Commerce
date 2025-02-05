package com.zup.ECommerce.Sistema.E_Commerce.repository;

import com.zup.ECommerce.Sistema.E_Commerce.models.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    boolean existsByProductName(String productName);
    void deleteById(Long id);
    Optional<ProductEntity> findByProductName(String productName);
}
