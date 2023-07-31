package com.devsupeior.dscommerce1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupeior.dscommerce1.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
