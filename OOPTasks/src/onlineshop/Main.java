package OOPTasks.src.onlineshop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = null;
        try {
            product1 = new Product("headphone", -10.0f);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        Product product2 = null;
        try {
            product2 = new Product("laptop", 4999.9f);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
        Product product3 = null;
        try {
            product3 = new Product("", 4999.9f);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        ShoppingCart shoppingCart = new ShoppingCart();

        try {
            shoppingCart.addProduct(product1);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException" + e.getMessage());
        }

        try {
            shoppingCart.addProduct(product2);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException" + e.getMessage());
        }

        try {
            shoppingCart.addProduct(product3);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException" + e.getMessage());
        }

        System.out.println("Total Cost: " + shoppingCart.getTotalCost());

        ArrayList<Product> products = shoppingCart.getProducts();
        System.out.println("Number of Products: " + products.size());

        OrderProcessor.placeOrder(shoppingCart);
    }
}
