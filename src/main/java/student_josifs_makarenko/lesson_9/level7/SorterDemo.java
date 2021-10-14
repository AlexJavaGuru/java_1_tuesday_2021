package student_josifs_makarenko.lesson_9.level7;

public class SorterDemo {
    public static void main(String[] args) {
        SortContext sortContext = new SortContext(new SeniorSorter());
        System.out.println(sortContext.executeContext(new Person("Piter", 65, "Male")));
    }
}
