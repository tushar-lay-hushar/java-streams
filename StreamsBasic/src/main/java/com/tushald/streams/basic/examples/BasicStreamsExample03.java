package com.tushald.streams.basic.examples;

import com.tushald.streams.basic.Category;
import com.tushald.streams.basic.ExampleData;
import com.tushald.streams.basic.Product;

import java.util.List;
import java.util.regex.Pattern;

public class BasicStreamsExample03 {

    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        products.stream()
                .filter(product -> product.getCategory().equals(Category.FOOD))
                .forEach(System.out::println);

        products.stream()
                .map(product -> String.format("The price of %s is $ %.2f", product.getName(), product.getPrice()))
                .forEach(System.out::println);

        Pattern spaces = Pattern.compile("\\s+");
        products.stream()
                .flatMap(product -> spaces.splitAsStream(product.getName()))
                .forEach(System.out::println);

        products.stream()
                .map(product -> spaces.splitAsStream(product.getName()))
                .forEach(System.out::println);
    }
}
