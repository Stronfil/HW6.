package com.komissarov.storefront.services;


import com.komissarov.storefront.entity.Product;
import com.komissarov.storefront.util.Cart;

import javax.servlet.http.HttpSession;

public interface CartService {
    void addProduct(HttpSession session, Product product);

    void deleteProduct(HttpSession session, Product product);

    void setProductCount(HttpSession session, Product product, int count);

    void addCartIfAbsent(HttpSession session);

    int getTotalCost(HttpSession session);

    Cart getCart(HttpSession session);
}
