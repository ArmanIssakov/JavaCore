package kz.arman.jcore.regular;

public class Order {
    private Customer customer;
    private Product product;
    private int amountProduct;
    private int totalCost;




    public int getTotalCost() {
        return totalCost;
    }

    public Order(Customer customer, Product product, int amountProduct, int totalCost) {
        this.customer = customer;
        this.product = product;
        this.amountProduct = amountProduct;
        this.totalCost = totalCost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmountProduct() {
        return amountProduct;
    }




}
