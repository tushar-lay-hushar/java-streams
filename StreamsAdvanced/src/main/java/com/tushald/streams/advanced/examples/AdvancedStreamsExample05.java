package com.tushald.streams.advanced.examples;

import com.tushald.streams.advanced.Category;
import com.tushald.streams.advanced.ExampleData;
import com.tushald.streams.advanced.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamsExample05 {

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        Map<Category, List<Product>> productsByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        Map<Category, List<String>> productNamesByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.mapping(Product::getName, Collectors.toList())));

        Map<Category, BigDecimal> totalPerCategory = products.stream()
                .collect(
                        Collectors.groupingBy(
                                Product::getCategory,
                                Collectors.mapping(
                                        Product::getPrice,
                                        Collectors.reducing(
                                                BigDecimal.ZERO,
                                                BigDecimal::add
                                        )
                                )
                        )
                );
    }
}
