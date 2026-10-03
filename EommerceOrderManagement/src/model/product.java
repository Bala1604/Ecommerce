package model;

public class product {
    private int productId;
    private String name;
    private double price;
    private int stockQuantity;

    public product(int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStockQuantity() { return stockQuantity; }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + name + ", Price: " + price + ", Stock: " + stockQuantity;
    }
}
