package com.telusko.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.telusko.entity.Product;


public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {

}
