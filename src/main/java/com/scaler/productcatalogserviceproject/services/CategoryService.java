package com.scaler.productcatalogserviceproject.services;

import com.scaler.productcatalogserviceproject.models.Category;

public interface CategoryService {

    Category createCategory(Category category);

    Category getCategoryByName(String categoryName);

    Category getCategoryById(Long id);
}
