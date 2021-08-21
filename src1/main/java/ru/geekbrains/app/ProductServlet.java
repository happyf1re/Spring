package ru.geekbrains.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import products.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ProductServlet", urlPatterns = "/product_servlet")
public class ProductServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        logger.info("Check products");
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product(1,"Product1",10);
        Product product2 = new Product(2,"Product2",20);
        Product product3 = new Product(3,"Product3",30);
        Product product4 = new Product(4,"Product4",40);
        Product product5 = new Product(5,"Product5",50);
        Product product6 = new Product(6,"Product6",60);
        Product product7 = new Product(7,"Product7",70);
        Product product8 = new Product(8,"Product8",80);
        Product product9 = new Product(9,"Product9",90);
        Product product10 = new Product(10,"Product10",100);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);

        for (int i = 0; i < 10; i++) {
            resp.getWriter().println(products.get(i));
        }
    }
}
