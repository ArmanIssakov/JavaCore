package kz.arman.jcore.regular;

import java.util.Random;

public enum Sale {
    ZERO(0), FIVE(5), TEN(10), FIFTEEN(15), TWENTY(20)
    ;
    private int sale;
    private static final Random RND = new Random();
    private static final Sale[] sales = values();

    public static Sale randomSale(){
        return sales[RND.nextInt(sales.length)];
    }

    public int getSale() {
        return sale;
    }

    Sale(int sale) {
        this.sale = sale;
    }

}
