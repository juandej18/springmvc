package com.personal.springapp.repository;

import java.util.List;

import com.personal.springapp.domain.Product;

public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);

}