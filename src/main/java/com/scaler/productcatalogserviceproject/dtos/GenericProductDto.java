package com.scaler.productcatalogserviceproject.dtos;


import com.scaler.productcatalogserviceproject.models.Category;
import com.scaler.productcatalogserviceproject.models.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GenericProductDto {

    private String title;
    private String description;
    private String image;
    private double price;
    private Category category;

    public static GenericProductDto convertToGenericProductDto(Product product) {
        /*return  GenericProductDto
                .builder()
                .title(product.getTitle())
                .description(product.getDescription())
                .image(product.getImage())
                .price(product.getPrice())
                .category(product.getCategory())
                .build();*/

        GenericProductDto dto = new GenericProductDto();
        dto.setTitle(product.getTitle());
        dto.setDescription(product.getDescription());
        dto.setImage(product.getImage());
        dto.setPrice(product.getPrice());
        dto.setCategory(product.getCategory());
        return dto;
    }

    public static Product convertToProductDto(GenericProductDto genericProductDto) {

        Product product = new Product();
        product.setTitle(genericProductDto.getTitle());
        product.setDescription(genericProductDto.getDescription());
        product.setImage(genericProductDto.getImage());
        product.setPrice(genericProductDto.getPrice());
        product.setCategory(genericProductDto.getCategory());
        return product;
    }
}

