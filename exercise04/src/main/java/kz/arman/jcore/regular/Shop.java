package kz.arman.jcore.regular;

import java.util.Scanner;

public class Shop {

    static Customer customer = new Customer("Arman", "Issakov", 29, "7777777777");
    static Customer customer1 = new Customer("Liza", "Won", 35, "8888888888");

    static Customer[] customersArray = new Customer[]{customer, customer1};

    public static Product product = new Product("Car", 100);
    public static Product product1 = new Product("Plane", 200);
    public static Product product2 = new Product("Boat", 300);
    static Product product3 = new Product("Hummer", 400);
    static Product product4 = new Product("Cup", 1);

    static Product[] productsArray = new Product[]{product, product1, product2, product3, product4};

    public static Order buy(String customerName, String customerPhone, String productName, int amount) throws CustomerException, ProductException, AmountException {
        Customer returnCustomer = null;
        Product returnProduct = null;
        int amountProduct = 1;
        int cost = 0;
        for (int i = 0; i < customersArray.length; i++) {
            if(customerName.equals(customersArray[i].getName()) && customerPhone.equals(customersArray[i].getPhoneNumber())){
                returnCustomer = customersArray[i];
            }
            }
        if (returnCustomer == null){
            throw new CustomerException("Такой покупатель отсутствует");
        }
        for (int i = 0; i < productsArray.length; i++) {
            if (productName.equals(productsArray[i].getProductName())){
                returnProduct = productsArray[i];
                cost = returnProduct.getPrice();
            }
        }
        if (returnProduct == null){
            throw new ProductException("Такой продукт отсутствует");
        }
        if (amount > 100 || amount < 0){
            throw new AmountException("Неверное количество");
        } else {
            amountProduct = amount;
        }

        return new Order(returnCustomer,returnProduct,amountProduct,cost*amountProduct);
        }


}


