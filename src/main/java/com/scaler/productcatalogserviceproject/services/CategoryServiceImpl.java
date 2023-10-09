package com.scaler.productcatalogserviceproject.services;

import com.scaler.productcatalogserviceproject.models.Category;
import com.scaler.productcatalogserviceproject.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    CategoryRepository categoryRepository;

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public Category getCategoryByName(String categoryName) {

        return categoryRepository.findByCategoryName(categoryName);
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }


}

