package com.geekbrains.service;

import com.geekbrains.entity.Product;
import com.geekbrains.repository.Bucket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private Bucket bucket;

    @Autowired
    public void setBucket(Bucket bucket) {
        this.bucket = bucket;
    }

    public Product getProductById(int id) {
        return bucket.getProductFromId(id);
    }

    public List<Product> showAllProductsInBucket(){
        return bucket.showAllProducts();
    }

    public void addProductToBucket(Product product){
        bucket.addProduct(product);
    }

    public ProductService(){}
}
