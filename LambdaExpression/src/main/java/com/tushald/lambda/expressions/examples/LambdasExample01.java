package com.tushald.lambda.expressions.examples;

import com.tushald.lambda.expressions.ExampleData;
import com.tushald.lambda.expressions.Product;

import java.util.List;

public class LambdasExample01 {

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

//        products.sort(new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getPrice().compareTo(p2.getPrice());
//            }
//        });

        products.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
