package com.muravlev.springboot.repositories;


import com.muravlev.springboot.entities.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class ProductDao {
    Session session = null;

    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Product.class)
            .buildSessionFactory();


    //create
    public void create (Product product) {
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }

    //delete
    public void delete (long id) {
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Product product = session.get(Product.class, id);
            session.delete(product);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }

    //read (by id) консольный вариант
    public Product readById(long id) {
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Product product = session.get(Product.class, id);
            session.getTransaction().commit();//не уверен, что нужно в read
            System.out.println(product);
            return product;
        } finally {
            session.close();
            factory.close();
        }
    }

    //readall
    public List<Product> readAll() {
            session = factory.getCurrentSession();
            session.beginTransaction();
            List<Product> listProduct = session
                    .createQuery("from Product").getResultList();
            System.out.println(listProduct);
            return listProduct;
    }

    //update
    public void updateDao(Product product) {
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(product);
        } finally {
            session.close();
            factory.close();
        }
    }
}
