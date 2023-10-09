package com.scaler.productcatalogserviceproject.controllers;

import com.scaler.productcatalogserviceproject.dtos.RequestProductDto;
import com.scaler.productcatalogserviceproject.dtos.ResponseProductDto;
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
    public ResponseProductDto addProduct(@RequestBody RequestProductDto request) {

        Product product =  productService.addProduct(request);
        return ResponseProductDto.convertToResponseProductDto(product);
    }
}

