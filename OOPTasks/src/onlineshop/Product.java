package OOPTasks.src.onlineshop;

public class Product {
    private String name;
    private float price;

    public Product(String name, float price) throws IllegalArgumentException {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be less than 0!");
        }
        if (StringValidationUtil.isEmpty(name) || StringValidationUtil.isNull(name)) {
            throw new IllegalArgumentException("Invalid product name!");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
