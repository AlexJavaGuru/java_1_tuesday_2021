package student_olga_urek.Lesson_4.level_6;

import java.util.Scanner;

class StockDemo {
    public static void main(String[] args) {
        Stock myStock = new Stock("Microsoft", 5000);
        myStock.updatePrice(6000);
        myStock.updatePrice(2000);
        myStock.updatePrice(10000);
        myStock.updatePrice(3000);
        myStock.getPriceInformation();

    }
}
