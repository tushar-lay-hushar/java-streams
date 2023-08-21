package com.tushald.functional.interfaces.examples;

import com.tushald.functional.interfaces.Category;
import com.tushald.functional.interfaces.ExampleData;
import com.tushald.functional.interfaces.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FunctionalInterfacesExample04 {

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

        BigDecimal priceLimit = new BigDecimal("2.00");

        Predicate<Product> isFood = product -> Category.FOOD.equals(product.getCategory());
        Predicate<Product> isCheap = product -> product.getPrice().compareTo(priceLimit) < 0;

        findProduct(products, isFood.and(isCheap))
                .ifPresentOrElse(
                        product -> System.out.printf("%s is cheap food for $ %.2f%n", product.getName(), product.getPrice()),
                        () -> System.out.printf("There are no cheap food products.")
                );
    }
}
