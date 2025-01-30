package com.zup.ECommerce.Sistema.E_Commerce.repository;

import com.zup.ECommerce.Sistema.E_Commerce.models.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
}
