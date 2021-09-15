package com.muravlev.springboot.repositories;

import com.muravlev.springboot.entities.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

// CRUD
@Repository
public class ProductRepository {

    private static AtomicLong identity = new AtomicLong(0);

    private final Map<Long, Product> identityMap = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        add(new Product(null, "Apple", "Good apples", new BigDecimal(10)));
        add(new Product(null, "Banana", "Good bananas", new BigDecimal(20)));
        add(new Product(null, "Orange", "Good oranges", new BigDecimal(30)));
    }

    public void add(Product product) {
        product.setId(identity.incrementAndGet());
        identityMap.put(product.getId(), product);
    }

    public void update(Product product) {
        identityMap.put(product.getId(), product);
    }

    public void remove(long id) {
        identityMap.remove(id);
    }

    public Product findById(long id) {
        return identityMap.get(id);
    }

    public List<Product> findAll() {
        return new ArrayList<>(identityMap.values());
    }
}
