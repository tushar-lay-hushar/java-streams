package com.tushald.streams.basic.examples;

import com.tushald.streams.basic.Category;
import com.tushald.streams.basic.ExampleData;
import com.tushald.streams.basic.Product;

import java.math.BigDecimal;
import java.util.List;

public class BasicStreamsExample04 {

    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        products.stream()
                .filter(product -> product.getCategory().equals(Category.OFFICE))
                .findFirst()
                .ifPresent(System.out::println);

        products.stream()
                .filter(product -> product.getCategory().equals(Category.OFFICE))
                .findAny()
                .ifPresent(System.out::println);

        boolean foundOfficeProduct =  products.stream()
                .anyMatch(product -> product.getCategory().equals(Category.OFFICE));
        System.out.println("Does the list contain at least one office product? " + foundOfficeProduct);

        BigDecimal priceLimit = new BigDecimal("10.00");
        boolean allProductsAreCheap = products.stream()
                .allMatch(product -> product.getPrice().compareTo(priceLimit) < 0);
        System.out.println("Are all products cheap? " + allProductsAreCheap);

        boolean allProductsAreExpensive = products.stream()
                .noneMatch(product -> product.getPrice().compareTo(priceLimit) < 0);
        System.out.println("Are all products expensive? " + allProductsAreExpensive);
    }
}
