package com.springboot.springboot_application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void addProduct(Product product) {
        String SQL = "insert into product values (?, ?, ?)";
        jdbcTemplate.update(SQL, new Object[] {product.getProductID(), product.getProductName(), product.getPrice()});
    }
}
