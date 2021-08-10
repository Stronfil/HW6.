package com.komissarov.storefront.services;

import com.komissarov.storefront.util.Cart;
import com.komissarov.storefront.entity.ShopOrder;

import java.util.List;

public interface OrderService {

    List<ShopOrder> getUserOrders();
    void saveOrder(Cart cart);
    void deleteOrder(long id);
}
