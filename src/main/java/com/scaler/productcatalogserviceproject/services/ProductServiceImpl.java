package com.scaler.productcatalogserviceproject.services;


import com.scaler.productcatalogserviceproject.dtos.RequestProductDto;
import com.scaler.productcatalogserviceproject.dtos.ResponseProductDto;
import com.scaler.productcatalogserviceproject.models.Category;
import com.scaler.productcatalogserviceproject.models.Product;
import com.scaler.productcatalogserviceproject.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{

    ProductRepository productRepository;
    CategoryService categoryService;

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product addProduct(RequestProductDto request) {

        Category category = categoryService.getCategoryByName(request.getCategoryName());
        Product product = RequestProductDto.convertToProductDto(request, category);
        return productRepository.save(product);
    }
}

