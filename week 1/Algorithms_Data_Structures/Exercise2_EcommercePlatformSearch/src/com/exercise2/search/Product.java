package com.exercise2.search;
public class Product {

    private int productId;
    private String productName;
    private double price;

    // Constructor
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Getter for Product ID
    public int getProductId() {
        return productId;
    }

    // Getter for Product Name
    public String getProductName() {
        return productName;
    }

    // Getter for Price
    public double getPrice() {
        return price;
    }

    // Display product details
    @Override
    public String toString() {
        return "Product ID   : " + productId +
               "\nProduct Name : " + productName +
               "\nPrice        : ₹" + price;
    }
}