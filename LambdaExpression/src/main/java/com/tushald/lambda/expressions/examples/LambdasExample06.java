package com.tushald.lambda.expressions.examples;

import com.tushald.lambda.expressions.ExampleData;
import com.tushald.lambda.expressions.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LambdasExample06 {

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        try (FileWriter writer = new FileWriter("products.txt")) {
            products.forEach(product -> {
                try {
                    writer.write(product.toString() + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException | RuntimeException e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}
