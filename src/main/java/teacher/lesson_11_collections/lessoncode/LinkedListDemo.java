package teacher.lesson_11_collections.lessoncode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {


        List<Product> products = new LinkedList<>();

        products.add(new Product(1L, "Banana"));
        products.add(new Product(2L, "Milk"));
        products.add(new Product(3L, "Bread"));
        products.add(new Product(4L, "Water"));

        System.out.println(products);

        Product product = products.get(2);

        Product searchProduct = new Product(null, "Bread");
        for (Product product1 : products) {
            if (product1.equals(searchProduct)) {
                System.out.println("Found");
            }
        }

        System.out.println(product);

        products.remove(1);
        System.out.println(products);

        System.out.println(products.get(0));
        System.out.println(products.get(1));
        System.out.println(products.get(2));


    }
}
