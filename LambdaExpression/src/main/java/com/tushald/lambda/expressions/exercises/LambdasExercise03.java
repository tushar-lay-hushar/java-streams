/*
 * This code is part of the course "Working with Streams and Lambda Expressions in Java (Java SE 11 Developer Certification 1Z0-819)" for Pluralsight.
 *
 * Copyright (C) 2021 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.tushald.lambda.expressions.exercises;

import com.tushald.lambda.expressions.ExampleData;
import com.tushald.lambda.expressions.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LambdasExercise03 {

    public interface ShoppingCartFactory {
        ShoppingCart newShoppingCart();
    }

    /**
     * Exercise 3a: Implement interface ShoppingCartFactory using a method reference.
     *
     * @return A new ShoppingCartFactory.
     */
    public ShoppingCartFactory getShoppingCartFactory() {
        // TODO: Implement interface ShoppingCartFactory by using a method reference
        // Note: Don't implement ShoppingCartFactory with an anonymous class
        return ShoppingCart::new; // Replace 'null' by your solution
    }

    public static class ShoppingCart {
        private final List<Product> products = new ArrayList<>();

        public void add(Product product) {
            this.products.add(product);
        }

        /**
         * Exercise 3b: Calculate the total amount of the items in the shopping cart.
         *
         * @return The total amount of the items in the shopping cart.
         */
        public BigDecimal getTotalAmount() {
            BigDecimal total = BigDecimal.ZERO;

            // TODO: This solution does not work. Can you explain why?
//            products.forEach(product -> total.add(product.getPrice()));

            // TODO: Implement this method in whatever way you like (you don't have to use lambda expressions)
            BigDecimal[] totalAmount = new BigDecimal[] { BigDecimal.ZERO };

            products.forEach(product -> totalAmount[0] = totalAmount[0].add(product.getPrice()));

            total = totalAmount[0];

            return total;
        }
    }

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        ShoppingCartFactory factory = new LambdasExercise03().getShoppingCartFactory();

        ShoppingCart shoppingCart = factory.newShoppingCart();

        shoppingCart.add(products.get(0));
        shoppingCart.add(products.get(1));
        shoppingCart.add(products.get(2));
        shoppingCart.add(products.get(3));
        shoppingCart.add(products.get(4));
        shoppingCart.add(products.get(5));

        System.out.println("Total Amount: " + shoppingCart.getTotalAmount());
    }
}
