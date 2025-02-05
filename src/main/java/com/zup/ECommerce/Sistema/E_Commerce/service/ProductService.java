package com.zup.ECommerce.Sistema.E_Commerce.service;

import com.zup.ECommerce.Sistema.E_Commerce.dtos.ProductRequestDTO;
import com.zup.ECommerce.Sistema.E_Commerce.dtos.ProductResponseDTO;

import java.util.List;

public interface ProductService {
    ProductResponseDTO addProduct(ProductRequestDTO productRequestDTO);
    List<ProductResponseDTO> getAllProducts();
    void deleteProduct(Long id);

}
