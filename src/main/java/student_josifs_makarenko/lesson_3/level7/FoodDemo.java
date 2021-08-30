package student_josifs_makarenko.lesson_3.level7;

import java.util.Scanner;

public class FoodDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Food food1 = new Food();
        System.out.println("Input your food's name");
        food1.setName(scanner.nextLine());
        System.out.println("Write true if your food is tasty write TRUE, else write FALSE");
        food1.setTaste(scanner.hasNext());
        food1.foodName();
        food1.showFoodTaste();
    }
}
