package com.scaler.productcatalogserviceproject.controllers;

import com.scaler.productcatalogserviceproject.dtos.GenericProductDto;
import com.scaler.productcatalogserviceproject.models.Product;
import com.scaler.productcatalogserviceproject.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {

    ProductService productService;
    @GetMapping("/{id}")
    public Product getProductById(Long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto request) {
        Product product =  productService.createProduct(request);
        return GenericProductDto.convertToGenericProductDto(product);
    }


}

