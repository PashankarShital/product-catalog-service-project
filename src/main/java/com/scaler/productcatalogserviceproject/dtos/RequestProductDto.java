package com.scaler.productcatalogserviceproject.dtos;

import com.scaler.productcatalogserviceproject.models.Category;
import com.scaler.productcatalogserviceproject.models.Product;
import lombok.Data;

@Data
public class RequestProductDto {

    private String title;
    private String description;
    private String imageUrl;
    private double price;
    private String categoryName;

    public static Product convertToProductDto(RequestProductDto request, Category category) {
        return Product.builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .imageUrl(request.getImageUrl())
                .price(request.getPrice())
                .category(category)
                .build();
    }
}
