package student_daniel.lesson11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        //add new record
        stringList.add("hello");
        stringList.add("my name");
        stringList.add("is");
        stringList.add("Dan");
        stringList.add("and");
        stringList.add("I");
        stringList.add("live in");
        stringList.add("Jurmala");


        for (String myStrings : stringList) {
            System.out.println(myStrings);
        }
        System.out.println();

        Integer a = 5;
        Integer b = 10;
        System.out.println(a + b);

        //remove by...
        stringList.remove("Dan"); //remove by content
        stringList.remove(2); //remove by index - is

        for (String myStrings : stringList) {
            System.out.println(myStrings);
        }
        System.out.println();
        //return int of element that contains "is" - index of string
        int isIndex = stringList.indexOf("Jurmala");
        System.out.println(isIndex);



        //return string element that contains in cell 3
        String getString = stringList.get(3);
        System.out.println(getString);

        //paramerization
        //List<Book> myBook = new ArrayList<>();
        //myBook.add("hello");
        //myBook.add("my name");
    }
}
