package com.tushald.streams.advanced.examples;

import com.tushald.streams.advanced.ExampleData;
import com.tushald.streams.advanced.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamsExample06 {

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        BigDecimal priceLimit = new BigDecimal("5.00");

        Map<Boolean, List<Product>> partitionedProducts = products.stream()
                .collect(Collectors.partitioningBy(product -> product.getPrice().compareTo(priceLimit) < 0));

        System.out.println("Cheap products: ");
        partitionedProducts.get(true).forEach(System.out::println);

        System.out.println("Expensive products: ");
        partitionedProducts.get(false).forEach(System.out::println);
    }
}
