package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.entity.Product;
import com.telusko.service.ProductService;

@RestController
@RequestMapping("/apis")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/findAll")
	Iterable<Product> findAll(){
		return service.getProducts();
	}
	
	@PostMapping("/insert")
	Product insertProduct(@RequestBody Product product) {
		return service.insertProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable int id){
		service.deleteProduct(id);
	}
	
	@PutMapping("/update/{id}")
	Product updateProduct(@RequestBody Product product,@PathVariable int id) {
		return service.updateProduct(product, id);
	}

}
