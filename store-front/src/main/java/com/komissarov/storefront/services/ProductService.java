package com.komissarov.storefront.services;

import com.komissarov.storefront.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(Double min, Double max, int page);

    List<Product> getProductsByCostBetween(double min, double max, int page);

    void addProduct(Product product);
}
