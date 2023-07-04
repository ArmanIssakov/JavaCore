package kz.arman.jcore.regular;

public class Product {
    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    private String productName;
    private int price;

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
