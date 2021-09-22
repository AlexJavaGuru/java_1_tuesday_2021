package student_daniel.lesson4.level6;

import java.util.Scanner;

class StockDemo {
    //Task 17
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);

        Stock google = new Stock("GOOG", 10, 10, 10);
        String priceInformation = google.getPriceInformation();

        System.out.println(priceInformation);
        System.out.println();
        System.out.println("Please input new price");
        google.updatePrice(numberInput.nextInt());
        System.out.println(priceInformation);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
