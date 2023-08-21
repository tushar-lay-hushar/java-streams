package com.tushald.lambda.expressions.examples;

import com.tushald.lambda.expressions.ExampleData;
import com.tushald.lambda.expressions.Product;

import java.math.BigDecimal;
import java.util.List;

public class LambdasExample03 {

    interface ProductFilter {
        boolean accept(Product product);
    }

    static void printProducts(List<Product> products, ProductFilter filter) {
        for (Product product : products) {
            if (filter.accept(product)) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        BigDecimal priceLimit = new BigDecimal("5.00");

        ProductFilter filter = product -> product.getPrice().compareTo(priceLimit) < 0;

//        priceLimit = new BigDecimal("6.00");

        printProducts(products, filter);
    }
}
