package teacher.lesson_11_collections.lessoncode;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Product product = new Product(1L, "Banana");
        Product productTwo = new Product(1L, "Banana");

        System.out.println(product.hashCode());
        System.out.println(productTwo.hashCode());

        Map<Integer, String> testMap = new HashMap<>();

        testMap.put(1, "One");
        testMap.put(2, "Two");
        testMap.put(3, "Three");
        testMap.put(4, "Four");
        testMap.put(5, "Five");
        testMap.put(10, "Ten");

        String string = testMap.get(4);
        System.out.println(string);
        System.out.println(testMap.containsKey(5));
        System.out.println(testMap.containsValue("Ten"));

        for (Map.Entry<Integer, String> integerStringEntry : testMap.entrySet()) {
            System.out.println(integerStringEntry.getKey() + ", " + integerStringEntry.getValue());
        }


    }
}
