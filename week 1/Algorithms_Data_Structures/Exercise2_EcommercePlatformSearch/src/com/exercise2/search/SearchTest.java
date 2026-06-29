package com.exercise2.search;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", 65000),
            new Product(102, "Mouse", 500),
            new Product(103, "Keyboard", 1200),
            new Product(104, "Monitor", 15000),
            new Product(105, "Printer", 9000)
        };

        System.out.println("===== E-Commerce Product Search =====");

        Product result = LinearSearch.search(products, 103);

        if (result != null) {
            System.out.println("\nLinear Search Result:");
            System.out.println(result);
        } else {
            System.out.println("Product not found.");
        }

        Product result2 = BinarySearch.search(products, 103);

        if (result2 != null) {
            System.out.println("\nBinary Search Result:");
            System.out.println(result2);
        } else {
            System.out.println("Product not found.");
        }
    }
}