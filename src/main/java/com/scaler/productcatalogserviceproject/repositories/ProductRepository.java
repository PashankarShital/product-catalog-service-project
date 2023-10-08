package com.scaler.productcatalogserviceproject.repositories;

import com.scaler.productcatalogserviceproject.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
