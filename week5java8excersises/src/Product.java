package week5java8excersises.src;

public class Product {
    private int id;
    private String productName;
    private String category;
    private double price;

    public Product(int id, String productName, String category, double price) {
        this.id = id;
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    public Product withPrice(double price) {
        if (this.price == price) {
            return this;
        } else {
            return new Product(this.id, this.productName, this.category, price);
        }
    }
}
