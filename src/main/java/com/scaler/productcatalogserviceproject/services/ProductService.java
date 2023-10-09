package com.scaler.productcatalogserviceproject.services;

import com.scaler.productcatalogserviceproject.dtos.RequestProductDto;
import com.scaler.productcatalogserviceproject.models.Product;

public interface ProductService {
    Product getProductById(Long id);

    Product addProduct(RequestProductDto product);
}
