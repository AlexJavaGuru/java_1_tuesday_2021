package student_josifs_makarenko.lesson_4.level6;

import java.util.Scanner;

public class StockDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name and real price of the stock");
        Stock stock = new Stock(scanner.nextLine(), scanner.nextInt());
        stock.setMaxPrice(stock.getRealPrice());
        stock.setMinPrice(stock.getRealPrice());
        stock.getPriceInformation();
        stock.writePriceInformation();
        System.out.println("Input new price");
        stock.updatePrice(scanner.nextInt());
        stock.getPriceInformation();
        stock.writePriceInformation();
        System.out.println("Input new price");
        stock.updatePrice(scanner.nextInt());
        stock.getPriceInformation();
        stock.writePriceInformation();
        System.out.println("Input new price");
        stock.updatePrice(scanner.nextInt());
        stock.getPriceInformation();
        stock.writePriceInformation();
    }
}
