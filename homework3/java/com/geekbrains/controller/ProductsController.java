package com.geekbrains.controller;

import com.geekbrains.entity.Product;
import com.geekbrains.repository.Bucket;
import com.geekbrains.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/form")
    public String getForm(Model uiModel){
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "form";
    }
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute("product") Product product) {
        productService.addProductToBucket(product);
        return "form";
    }

    @RequestMapping(value = "/showall", method = RequestMethod.POST)
    public String showAllProducts() {
        productService.showAllProductsInBucket();
        return "showall";
    }






}
