package com.telusko.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.entity.Product;
import com.telusko.repo.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public Iterable<Product> getProducts(){
		return repo.findAll();
	}
	
	public Product insertProduct(Product product) {
		return repo.save(product); 
	}
	
	public Product updateProduct(Product product, int id) {
		Product new_product = repo.findById(id).get();
		new_product.setPrice(product.getPrice());
		new_product.setName(product.getName());
		new_product.setDescription(product.getDescription());
		new_product.setQuantity(product.getQuantity());
		return repo.save(new_product);
	}
	
	public void deleteProduct(int id) {
		repo.deleteById(id);
	}
	

}
