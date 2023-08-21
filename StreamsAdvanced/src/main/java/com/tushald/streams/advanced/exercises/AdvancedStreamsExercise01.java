package com.tushald.streams.advanced.exercises;

import com.tushald.streams.advanced.Product;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AdvancedStreamsExercise01 {

    /**
     * Exercise 1: Collect product names into a sorted set.
     *
     * @param products A list of products.
     * @return A TreeSet containing the names of the products.
     */
    public Set<String> getSortedProductNames(List<Product> products) {
        // TODO: Collect the names of the products into a TreeSet.
        //
        // Hint: Use the collect() method that takes three functions parameters.
        // What is the purpose of each of these three functions and how do you implement them? (Consult the API documentation).
        // Use method references or lambda expressions to implement the three functions.

        return products.stream()
                .collect(HashSet::new, (set, product) -> set.add(product.getName()), HashSet::addAll);

//        throw new UnsupportedOperationException("Not yet implemented"); // Remove this line
    }
}
