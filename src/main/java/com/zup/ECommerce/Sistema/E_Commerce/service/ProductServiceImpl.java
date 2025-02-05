package com.zup.ECommerce.Sistema.E_Commerce.service;


import com.zup.ECommerce.Sistema.E_Commerce.dtos.ProductRequestDTO;
import com.zup.ECommerce.Sistema.E_Commerce.dtos.ProductResponseDTO;
import com.zup.ECommerce.Sistema.E_Commerce.models.ProductEntity;
import com.zup.ECommerce.Sistema.E_Commerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductEntity mapToEntity(ProductRequestDTO productRequestDTO) {
        return new ProductEntity(productRequestDTO.productName(),
                productRequestDTO.price(),
                productRequestDTO.quantity());
    }

    private ProductResponseDTO mapToResponse(ProductEntity productEntity) {
        return new ProductResponseDTO(productEntity.getId(),
                productEntity.getProductName(),
                productEntity.getPrice(),
                productEntity.getQuantity());
    }

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductResponseDTO addProduct(ProductRequestDTO productRequestDTO) {
        String productName = productRequestDTO.productName();
        if (productRepository.existsByProductName(productName)){
            throw new ProductAlreadyExistsException("O produto já existe.");
        }
        ProductEntity productEntity = mapToEntity(productRequestDTO);
        productRepository.save(productEntity);
        return mapToResponse(productEntity);
    }

    @Override
    public List<ProductResponseDTO> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteProduct(Long id) {
        if (!productRepository.existsById(id)){
            throw new ProductNotFoundException("O produto não foi encontrado.");
        }
        productRepository.deleteById(id);
    }
}
