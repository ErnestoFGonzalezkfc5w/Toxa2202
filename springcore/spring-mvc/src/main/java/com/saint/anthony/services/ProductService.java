package com.saint.anthony.services;

import com.saint.anthony.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAllProducts();
    Product getProductById(Integer id);
}
