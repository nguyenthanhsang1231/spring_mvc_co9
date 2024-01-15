package com.java.springmvcc09.controller;

import com.java.springmvcc09.model.Product;
import com.java.springmvcc09.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView("/product/list");
        modelAndView.addObject("list", productService.findAll());
        return modelAndView;
    }
    @GetMapping("/create")
    public String showCreate() {
       return "/product/create";
    }
    @PostMapping("/save")
    public ModelAndView save(Product product) {
        productService.add(product);
        ModelAndView modelAndView = new ModelAndView("redirect:/products");
        modelAndView.addObject("list", productService.findAll());
        return modelAndView;
    }

    public Product findById(int id) {
        Product product = new Product();
        return product;
    }
}
