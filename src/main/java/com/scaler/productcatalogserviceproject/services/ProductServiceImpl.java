package com.scaler.productcatalogserviceproject.services;


import com.scaler.productcatalogserviceproject.dtos.GenericProductDto;
import com.scaler.productcatalogserviceproject.models.Product;
import com.scaler.productcatalogserviceproject.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{

    ProductRepository productRepository;
    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product createProduct(GenericProductDto genericProductDto) {
        Product product = GenericProductDto.convertToProductDto(genericProductDto);
        return productRepository.save(product);
    }
}

