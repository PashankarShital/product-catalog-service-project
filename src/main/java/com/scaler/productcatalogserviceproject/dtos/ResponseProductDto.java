package com.scaler.productcatalogserviceproject.dtos;

import com.scaler.productcatalogserviceproject.models.Product;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseProductDto {

    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private double price;
    private String categoryName;

    public static ResponseProductDto convertToResponseProductDto(Product product) {
        return ResponseProductDto.builder()
                .id(product.getId())
                .title(product.getTitle())
                .description(product.getDescription())
                .imageUrl(product.getImageUrl())
                .price(product.getPrice())
                .categoryName(product.getCategory().getCategoryName())
                .build();
    }
}
