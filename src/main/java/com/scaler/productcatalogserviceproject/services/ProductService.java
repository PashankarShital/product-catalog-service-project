package com.scaler.productcatalogserviceproject.services;

import com.scaler.productcatalogserviceproject.dtos.GenericProductDto;
import com.scaler.productcatalogserviceproject.models.Product;

public interface ProductService {
    Product getProductById(Long id);

    Product createProduct(GenericProductDto product);
}
