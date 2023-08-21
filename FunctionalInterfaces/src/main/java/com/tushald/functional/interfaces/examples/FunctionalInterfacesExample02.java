package com.tushald.functional.interfaces.examples;

import com.tushald.functional.interfaces.Category;
import com.tushald.functional.interfaces.ExampleData;
import com.tushald.functional.interfaces.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionalInterfacesExample02 {

    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        Map<Category, List<Product>> productsByCategory = new HashMap<>();

        for (Product product : products) {
//            Category category = product.getCategory();
            productsByCategory.computeIfAbsent(product.getCategory(), c -> new ArrayList<>()).add(product);
//            if (!productsByCategory.containsKey(category)) {
//                productsByCategory.put(category, new ArrayList<>());
//            }
//            productsByCategory.get(category).add(product);
        }

        productsByCategory.forEach(((category, productsList) -> {
            System.out.println("Category: " + category);
            productsList.forEach(product -> System.out.println("- " + product.getName()));
        }));
    }
}
