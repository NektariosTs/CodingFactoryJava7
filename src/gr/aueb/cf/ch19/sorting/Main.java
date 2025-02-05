package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products1 = List.of(                   //Immutable list
                new Product("", 12.5, 10),
                new Product("", 12.5, 10));

        List<Product> products2 = Arrays.asList(                   //Partially immutable list
                new Product("", 12.5, 10),
                new Product("", 12.5, 10));

        List<Product> products = new ArrayList<>(List.of(                   //Partially immutable list
                new Product("Apples", 12.5, 10),
                new Product("Oranges", 12.5, 10),
                new Product("Berries", 12.5, 10),
                new Product("Apples", 32.5, 17)));

        products.sort(Comparator.naturalOrder());           //Sort base in comparable
        products.sort(Comparator.reverseOrder());           //based on Comparable

        products.sort(Comparator.comparing(Product::getName));
        products.sort(Comparator.
                comparing(Product::getName)
                .thenComparing(Product::getQuantity));


        products.sort(Comparator.
                comparing(Product::getName)
                .thenComparing(Product::getQuantity)
                .thenComparing(Product::getPrice).reversed());

        products.sort(Comparator.
                comparing(Product::getName)
                .thenComparing(Product::getQuantity, Comparator.reverseOrder()));

        products.forEach(System.out::println);
    }
}
