package teacher.lesson_11_collections.lessoncode;

import java.util.HashSet;
import java.util.Set;

public class SetHashDemo {

    public static void main(String[] args) {

        Set<Product> products = new HashSet<>();

        Product banana = new Product(1L, "Banana");
        Product milk = new Product(200L, "Milk");
        Product bread = new Product(332L, "Bread");
        Product apple = new Product(472L, "Apple");

        products.add(banana);
        products.add(milk);
        products.add(bread);
        products.add(apple);
        products.add(apple);
        products.add(apple);

        System.out.println(products);
        System.out.println(products.size());

        for (Product product : products) {
            if (product.equals(bread)) {
                System.out.println(product);
            }
        }
    }
}
