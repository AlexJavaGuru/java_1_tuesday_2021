package teacher.lesson_6_arrays_while_loop.lessoncode;

import java.util.Arrays;

public class ProductShelf {

    public static void main(String[] args) {

        Product[] products = {new Product("Milk", 10),
                new Product("Banana", 20),
                new Product("Apple", 30)
        };

        for (int i = 0; i < products.length; i++) {
            if ("Apple".equals(products[i].getName())) {
                products[i] = null;
            }
        }

        System.out.println(Arrays.toString(products));
    }
}
