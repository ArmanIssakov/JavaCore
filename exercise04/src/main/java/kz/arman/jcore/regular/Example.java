package kz.arman.jcore.regular;

public class Example {
    private String customerName;
    private String customerPhone;
    private String productName;

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }

    private int amount;

    public Example(String customerName, String customerPhone, String productName, int amount) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.productName = productName;
        this.amount = amount;
    }
}
