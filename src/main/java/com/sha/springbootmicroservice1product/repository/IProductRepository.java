package com.sha.springbootmicroservice1product.repository;

import com.sha.springbootmicroservice1product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<Model Sınıfı, Model sınıfındaki Id sınıfı>
public interface IProductRepository extends JpaRepository<Product, Long> {
}
