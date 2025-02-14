package com.springboot.springboot_application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/addProduct")
    public ModelAndView addProduct(@RequestParam("productID") int productID, @RequestParam("productName") String productName, @RequestParam("price") int price) {
        Product product = new Product();
        product.setProductID(productID);
        product.setProductName(productName);
        product.setPrice(price);
        productService.addProduct(product);
        return new ModelAndView("success.jsp");
    }
}
