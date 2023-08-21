package com.tushald.lambda.expressions.examples;

import com.tushald.lambda.expressions.Category;
import com.tushald.lambda.expressions.ExampleData;
import com.tushald.lambda.expressions.Product;

import java.math.BigDecimal;
import java.util.List;

public class LambdasExample07 {

    interface ProductFactory {
        Product create(Category category, String name, BigDecimal price);
    }

    static boolean isExpensive(Product product) {
        return product.getPrice().compareTo(new BigDecimal("5.00")) >= 0;
    }

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        products.removeIf(LambdasExample07::isExpensive);

//        products.forEach(product -> System.out.println(product));
        products.forEach(System.out::println);

        products.stream().map(Product::getName).forEach(System.out::println);

        ProductFactory factory = Product::new;

        Product blueberries = factory.create(Category.FOOD, "Blueberries", new BigDecimal("6.95"));

        System.out.println(blueberries);
    }
}
