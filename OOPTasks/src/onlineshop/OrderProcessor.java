package OOPTasks.src.onlineshop;

import java.util.ArrayList;

public class OrderProcessor {
    public static void placeOrder(ShoppingCart shoppingCart) {
        System.out.println("Order Details:");
        ArrayList<Product> products = shoppingCart.getProducts();

        System.out.printf("%-15s %-10s%n", "Product Name", "Price");

        for (Product product : products) {
            System.out.printf("%-15s %.2f%n", product.getName(), product.getPrice());
        }
        System.out.printf("%n%-15s %.2f%n", "Total Cost:", shoppingCart.getTotalCost());
    }
}
