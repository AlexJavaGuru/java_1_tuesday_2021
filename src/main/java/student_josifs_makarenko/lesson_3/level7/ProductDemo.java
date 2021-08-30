package student_josifs_makarenko.lesson_3.level7;

import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product1 = new Product();
        System.out.println("Input product name");
        product1.setName(scanner.nextLine());
        System.out.println("Input product price");
        product1.setRegularPrice(scanner.nextDouble());
        System.out.println("Input percent of discount");
        product1.setDiscount(scanner.nextDouble());
        product1.calculationAfterPrice();
    }
}
