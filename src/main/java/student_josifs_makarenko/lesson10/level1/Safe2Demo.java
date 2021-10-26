package student_josifs_makarenko.lesson10.level1;
//task5
public class Safe2Demo {
    public static void main(String[] args) {
        Safe2 safe2 = new Safe2();
        safe2.putMoney(1234, 10);
        safe2.getMoney(1234, 10);
        System.out.println(safe2.getBalance());
    }
}
