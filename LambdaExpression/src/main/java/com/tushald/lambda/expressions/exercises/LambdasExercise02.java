/*
 * This code is part of the course "Working with Streams and Lambda Expressions in Java (Java SE 11 Developer Certification 1Z0-819)" for Pluralsight.
 *
 * Copyright (C) 2021 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.tushald.lambda.expressions.exercises;

import com.tushald.lambda.expressions.Category;
import com.tushald.lambda.expressions.ExampleData;
import com.tushald.lambda.expressions.Product;

import java.util.ArrayList;
import java.util.List;

public class LambdasExercise02 {

    public interface ProductFilter {
        boolean accept(Product product);
    }

    /**
     * Exercise 2: Find products by category by implementing a functional interface using a lambda expression and calling it.
     *
     * @param products The list of products to search.
     * @param category The category of products to search for.
     * @return A new list containing the products which are in the specified category.
     */
    public List<Product> findProductsByCategory(List<Product> products, Category category) {
        // TODO: Implement interface ProductFilter with a lambda expression
        // The lambda expression should return true if the product is in the given category
        ProductFilter filter = product -> category.equals(product.getCategory()); // TODO: Replace 'null' by a lambda expression

        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            // TODO: Add products that are accepted by the filter to the 'result' list
            if(filter.accept(product))
                result.add(product);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        List<Product> searchResult = new LambdasExercise02().findProductsByCategory(products, Category.FOOD);

        for (Product product : searchResult) {
            System.out.println(product);
        }
    }
}
