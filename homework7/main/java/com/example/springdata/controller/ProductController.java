package com.example.springdata.controller;


import com.example.springdata.entity.Product;
import com.example.springdata.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String indexPage(Model model,
                            @RequestParam(name = "min", required = false) Integer min,
                            @RequestParam(name = "max", required = false) Integer max

    ) {
        if (min == null && max == null) {
            model.addAttribute("products", productService.getAllProduct());
        } else if(max != null && min == null) {
            model.addAttribute("products", productService.getAllMoreThanMax(max));
        } else if(max == null && min != null) {
            model.addAttribute("products", productService.getAllLessThanMin(min));
        } else if (max != null && min != null) {
            model.addAttribute("products", productService.getAllBetweenMaxAndMin(max, min));
        }
        return "index";
    }

    @GetMapping("/{id}")
    public String editProduct(@PathVariable(value = "id") Long id, Model model) {
        model.addAttribute("product", productService.getById(id));
        return "product_form";
    }

    @PostMapping("/product_update")
    public String updateProduct(Product product) {
        productService.addOrUpdate(product);
        return "redirect:/product";
    }

    @GetMapping("/new")
    public String newProduct(Model model) {
        model.addAttribute(new Product());
        return "product_form";
    }

    @GetMapping("/delete/{id}")
    public String removeProduct(@PathVariable(value = "id") Long id) {
        productService.removeById(id);
        return "redirect:/product";
    }
}
