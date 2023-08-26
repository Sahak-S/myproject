package com.example.myproject.controller;

import com.example.myproject.model.Product;
import com.example.myproject.repository.ProductRepository;
import com.example.myproject.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {


    private final ProductService productService;

    @GetMapping("/product")
    public String product(ModelMap map) {
      //  List<Product> products = productService.findAll();
        map.addAttribute("products", productService.findAll());
        return "product";
    }

    @GetMapping("/addProduct")
    public String addProduct(ModelMap map) {
        List<Product> products = productService.findAll();
        map.addAttribute("products", products);
        return "saveProduct";
    }


    @PostMapping("/product")
    public String productSave(@ModelAttribute Product product) {
        productService.save(product);
        return "redirect:/product";
    }
}
