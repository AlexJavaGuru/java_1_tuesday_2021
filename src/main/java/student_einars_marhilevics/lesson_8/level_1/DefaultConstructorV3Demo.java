package student_einars_marhilevics.lesson_8.level_1;

public class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 constructorV3 = new DefaultConstructorV3("Vasja Pupkin", 18, true, false);
        System.out.println(constructorV3.getFullName());
        System.out.println(constructorV3.getAge());
        System.out.println(constructorV3.isFemale());
        System.out.println(constructorV3.isMale());
    }
}
