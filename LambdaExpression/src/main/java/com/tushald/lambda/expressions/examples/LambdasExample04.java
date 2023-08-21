package com.tushald.lambda.expressions.examples;

import com.tushald.lambda.expressions.ExampleData;
import com.tushald.lambda.expressions.Product;

import java.math.BigDecimal;
import java.util.List;

public class LambdasExample04 {

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        BigDecimal priceLimit = new BigDecimal("5.0");

        int numberOfCheapProducts = 0;
//        for (Product product : products) {
//            if (product.getPrice().compareTo(priceLimit) < 0) {
//                numberOfCheapProducts++;
//            }
//        }

//        products.forEach( product -> {
//            if (product.getPrice().compareTo(priceLimit) < 0) {
//                numberOfCheapProducts++;
//            }
//        });

        System.out.println("There are " + numberOfCheapProducts + " cheap products.");
    }
}
