package com.scaler.productcatalogserviceproject.repositories;

import com.scaler.productcatalogserviceproject.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
