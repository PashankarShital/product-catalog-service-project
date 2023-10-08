package com.scaler.productcatalogserviceproject.controllers;


import com.scaler.productcatalogserviceproject.models.Category;
import com.scaler.productcatalogserviceproject.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable("id") Long id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }
}

