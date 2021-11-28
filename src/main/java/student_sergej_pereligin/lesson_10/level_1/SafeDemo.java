package student_sergej_pereligin.lesson_10.level_1;


public class SafeDemo {
    public static void main(String[] args) {

        Safe safe = new Safe(123, 100, "Dave");

        //I can print attributes
        System.out.println(safe.pinCode);
        System.out.println(safe.amountOfMoney);

        // private one won't be available. I won't even be able to call it
        //System.out.println(safe.nameOfOwner);

        //I can change values (unless they are set as final);
        safe.pinCode = 234;
        System.out.println(safe.pinCode);



    }

}
