package com.personal.springapp.service;

import java.io.Serializable;
import java.util.List;

import com.personal.springapp.domain.Product;

public interface ProductManager extends Serializable {

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();

}