package com.komissarov.storefront.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.komissarov.storefront.util.Cart;
import org.springframework.stereotype.Component;

@Component
public class CartMapperService {

    ObjectMapper objectMapper;

    public CartMapperService() {
        objectMapper = new ObjectMapper();
    }

    public String serialize(Cart cart) {
        try {
            return objectMapper.writeValueAsString(cart);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public Cart deserialize(String cart) {
        try {
            return objectMapper.readValue(cart, Cart.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
