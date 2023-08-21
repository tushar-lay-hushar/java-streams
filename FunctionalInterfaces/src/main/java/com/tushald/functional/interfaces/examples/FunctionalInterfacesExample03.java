package com.tushald.functional.interfaces.examples;

import com.tushald.functional.interfaces.ExampleData;
import com.tushald.functional.interfaces.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfacesExample03 {

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

        Function<Product, BigDecimal> productToPrice = Product::getPrice;
        Function<BigDecimal, String> priceToMessage = price -> String.format("The price of %s is $ %.2f%n", name, price);

//        Function<Product, String> productToMessage = productToPrice.andThen(priceToMessage);
        Function<Product, String> productToMessage = priceToMessage.compose(productToPrice);

        findProduct(products, product -> product.getName().equals(name))
                .map(productToMessage)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.printf("%s is not available%n", name)
                );
    }
}
