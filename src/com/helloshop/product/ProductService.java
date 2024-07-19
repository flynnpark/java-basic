package com.helloshop.product;

import com.helloshop.order.Order;
import com.helloshop.user.User;

public class ProductService {
    public static void main(String[] args) {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
