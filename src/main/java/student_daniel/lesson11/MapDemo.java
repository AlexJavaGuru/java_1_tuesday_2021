package student_daniel.lesson11;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "One");
        myMap.put(2, "Two");
        myMap.put(3, "Three");
        myMap.put(4, "Four");
        myMap.put(5, "Five");

        myMap.put(1, "New values");

        String string = myMap.get(4);
        System.out.println(string + " got it!");
        System.out.println(myMap.containsKey(5) + "returns boolean value");
        System.out.println(myMap.containsValue("Ten") + "sorry we don't have ");

        for (Map.Entry<Integer, String> integerStringEntry : myMap.entrySet()) {
            //Key - 1,2,3,4,5
            System.out.println(integerStringEntry.getKey());
            //Value - One, Two, Three, Four, Five
            System.out.println(integerStringEntry.getValue());
        }

        //System.out.println(new Integer(1).hashCode());
        //hashMap = key value pairs
        //hashCode() & (n - 1)    where n = size (15 from 0 to 15)
        //get hash() from key
        //convert received hashCode to binary number
        //for example 0101
        //15 = 1111
        //do & with 0101 and 1111
        //result 101
        //convert back to integer
        //result 5
        //5 is the bucket number
    }
}
