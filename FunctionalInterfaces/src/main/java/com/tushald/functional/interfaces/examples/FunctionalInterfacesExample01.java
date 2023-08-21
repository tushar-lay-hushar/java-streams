package com.tushald.functional.interfaces.examples;

import com.tushald.functional.interfaces.ExampleData;
import com.tushald.functional.interfaces.Product;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FunctionalInterfacesExample01 {

    static Optional<Product> findProduct(List<Product> products, Predicate<Product> predicate) {
        for (Product product : products) {
            if (predicate.test(product)) {
                return Optional.of(product);
            }
        }

        return Optional.empty();
    }

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        String name = "Spaghetti";
        Optional<Product> searchResult = findProduct(products, product -> product.getName().equals(name));
        if (searchResult.isPresent()) {
            Product product = searchResult.get();
            System.out.println(product);
        }

        findProduct(products, product -> product.getName().equals(name))
                .map(Product::getPrice)
                .ifPresentOrElse(
                        price -> System.out.printf("The price of %s is $ %.2f%n", name, price),
                        () -> System.out.printf("%s is not available%n", name)
                );
    }
}
