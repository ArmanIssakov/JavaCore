package kz.arman.jcore.sample;

import kz.arman.jcore.regular.*;

import java.util.SortedMap;

public class Main {

        public static void applyDiscount(Product product){
                System.out.println("Изначальная цена: " + product.getPrice());
                int finishCost = 0;
                double price = product.getPrice();
                double sale = Sale.randomSale().getSale();
                finishCost = product.getPrice() - ((int) (price * sale / 100));
                product.setPrice(finishCost);
                System.out.println("Цена со скидкой: " + product.getPrice());

        }

        public static void main(String[] args) {


                Order[] ordersArray = new Order[5];


                Example ex = new Example("Arman", "7777777777", "Car", 5);
                Example ex1 = new Example("Liza", "8888888888", "Coke", 6);
                Example ex2 = new Example("Liza", "8888888888", "Plane", 112);
                Example ex3 = new Example("Arman", "0000000000", "Boat", 9);

                Example[] examplesArray = new Example[]{ex, ex1, ex2, ex3};

                        Order order = null;
                        int j = 0;
                        for (int i = 0; i < examplesArray.length; i++) {
                                try {
                                        order = Shop.buy(examplesArray[i].getCustomerName(), examplesArray[i].getCustomerPhone(), examplesArray[i].getProductName(), examplesArray[i].getAmount());
                                        if (order instanceof Order){
                                                ordersArray[j] = order;
                                                j++;
                                        }
                                }catch (ProductException e){
                                        System.out.println("Не совершайте данную покупку");
                                }catch (AmountException e){
                                        System.out.println("Количество товара было изменено на 1");
                                        order = Shop.buy(examplesArray[i].getCustomerName(), examplesArray[i].getCustomerPhone(), examplesArray[i].getProductName(), 1);
                                        ordersArray[j] = order;
                                        j++;
                                }catch (CustomerException e){
                                        System.out.println(e.getMessage());
                                }
                        }

                System.out.println();
                System.out.println("Список совершенных покупок");
                for (int i = 0; i < ordersArray.length; i++) {
                        if(ordersArray[i] != null){
                                System.out.println("ПОКУПАТЕЛЬ: " + ordersArray[i].getCustomer().getName() + " НОМЕР: " + ordersArray[i].getCustomer().getPhoneNumber() + " ТОВАР: " + ordersArray[i].getProduct().getProductName() + " КОЛИЧЕСТВО: " + ordersArray[i].getAmountProduct() + " СТОИМОСТЬ: " + ordersArray[i].getProduct().getPrice() + " ОБЩАЯ СТОИМОСТЬ: " + ordersArray[i].getTotalCost());
                        } else {
                                System.out.println("null");
                        }
                }

                System.out.println();
                System.out.println("Задание по поводу скидок");
                Main.applyDiscount(Shop.product);
                Main.applyDiscount(Shop.product1);
                Main.applyDiscount(Shop.product2);



        }




}
