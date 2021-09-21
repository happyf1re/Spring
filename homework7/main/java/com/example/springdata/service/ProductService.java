package com.example.springdata.service;


import com.example.springdata.entity.Product;
import com.example.springdata.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService {

    public ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
    @Transactional
    public List<Product> getAllMoreThanMax(int max) {
        return productRepository.findAllByPriceGreaterThanEqual(max);
    }

    @Transactional
    public Object getAllLessThanMin(int min) {
        return productRepository.findAllByPriceIsLessThanEqual(min);
    }

    @Transactional
    public Object getAllBetweenMaxAndMin(int max, int min) {
        return productRepository.findAllByPriceBetween(max, min);
    }

    @Transactional
    public Product getById(Long id) {
        return productRepository.getById(id);
    }

    @Transactional
    public void removeById(Long id) {
        productRepository.deleteById(id);
    }

    @Transactional
    public void addOrUpdate(Product product) {
        productRepository.save(product);
    }




}
