package teacher.lesson_11_collections.lessoncode;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternalDemo {

    public static void main(String[] args) {


        Map<Product, Integer> store = new HashMap<>();

        Product banana = new Product(1L, "Banana");
        Product milk = new Product(200L, "Milk");
        Product bread = new Product(332L, "Bread");
        Product apple = new Product(472L, "Apple");

        System.out.println(banana.hashCode());
        System.out.println(milk.hashCode());

        // hashCode() & (n - 1) где n = size (15)
        // 1110110001010100011111101100101
        // 0000000000000000000000000001111
        // 0000000000000000000000000000101 = 5 bucket

        //milk
        //1001001011010000110100
        //0000000000000000001111
        //                  0100 = 4

        // fake calculations
        // bucket = 5
        store.put(banana, 100);
        store.put(milk, 50);
        store.put(bread, 200);
        store.put(apple, 1000);

        System.out.println("Value Is " +  store.get(milk));

        for (Map.Entry<Product, Integer> entry : store.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
