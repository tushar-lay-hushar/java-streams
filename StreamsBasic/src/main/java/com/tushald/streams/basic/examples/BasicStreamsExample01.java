package com.tushald.streams.basic.examples;

import com.tushald.streams.basic.ExampleData;
import com.tushald.streams.basic.Product;

import java.util.List;
import java.util.stream.Stream;

public class BasicStreamsExample01 {

    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        Stream<Product> stream = products.stream().map(product -> {
            System.out.println(product);
            return product;
        });

        stream.forEach(product -> {});
    }
}
