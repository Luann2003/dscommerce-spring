package com.devsupeior.dscommerce1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsupeior.dscommerce1.dto.ProductDTO;
import com.devsupeior.dscommerce1.entities.Product;
import com.devsupeior.dscommerce1.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {
		Product product = repository.findById(id).get();
		return new ProductDTO(product);
		

	}
	
}
