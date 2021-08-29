package com.geekbrains.repository;

import com.geekbrains.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class Bucket {
    List<Product> bucket = new ArrayList<>();
    boolean found = false;

    public void addProduct(Product product) {
        bucket.add(product);
    }

    public List<Product> showAllProducts() {
        List<Product> all = new ArrayList<>();
        for (int i = 0; i < bucket.size(); i++) {
            all.add(bucket.get(i));
            System.out.println(bucket.get(i));
        }
        return all;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "bucket=" + bucket +
                '}';
    }

    public Product getProductFromId(int id) {
        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i).getId() == id) {
                found = true;
                System.out.println("Продукт по номеру id = " + id + " "
                        + bucket.get(i).getTitle() + " ценой " + bucket.get(i).getCost());
                return bucket.get(i);
            }
        }
        if(!found) {
            System.out.println("Продукта с таким индексом в корзине нет");
        } return null;
    }
}
