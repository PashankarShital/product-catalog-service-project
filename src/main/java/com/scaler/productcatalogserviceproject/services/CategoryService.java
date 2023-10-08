package com.scaler.productcatalogserviceproject.services;

import com.scaler.productcatalogserviceproject.models.Category;

public interface CategoryService {
    Category getCategoryById(Long id);

    Category createCategory(Category category);
}
