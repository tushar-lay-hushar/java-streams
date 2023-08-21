package com.tushald.streams.advanced.examples;

import com.tushald.streams.advanced.Category;
import com.tushald.streams.advanced.ExampleData;
import com.tushald.streams.advanced.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamsExample04 {

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        Map<Category, BigDecimal> totalPerCategory = products.stream()
                .collect(
                        Collectors.toMap(
                                Product::getCategory,
                                Product::getPrice,
                                BigDecimal::add
                        )
                );

        System.out.println(totalPerCategory);
    }
}
