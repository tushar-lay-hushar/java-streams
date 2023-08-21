package com.tushald.lambda.expressions.examples;

import com.tushald.lambda.expressions.ExampleData;
import com.tushald.lambda.expressions.Product;

import java.math.BigDecimal;
import java.util.List;

public class LambdasExample02 {

    static void printProducts(List<Product> products, BigDecimal priceLimit) {
        for (Product product : products) {
            if (product.getPrice().compareTo(priceLimit) < 0) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        BigDecimal priceLimit = new BigDecimal("5.00");

        printProducts(products, priceLimit);
    }
}
