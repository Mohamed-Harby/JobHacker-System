package OOPTasks.src.onlineshop;

import OOPTasks.src.onlineshop.Product;

import java.util.ArrayList;

public class ShoppingCart {
    private float totalCost;
    ArrayList<Product> products;

    public ShoppingCart() {
        this.totalCost = 0.0f;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product == null) {
            throw new NullPointerException("Product cannot be null!");
        }
        this.products.add(product);
        updateTotalCost(product.getPrice());
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
        updateTotalCost(-product.getPrice());
    }

    public float getTotalCost() {
        return totalCost;
    }

    private void updateTotalCost(float priceChange) {
        float newTotalCost = totalCost + priceChange;
        if (newTotalCost >= 0) {
            this.totalCost = newTotalCost;
        } else {
            throw new IllegalStateException("Total cost cannot be less than 0!");
        }
    }

    public ArrayList<Product> getProducts() {
        return new ArrayList<>(products); // shallow copy
    }
}
