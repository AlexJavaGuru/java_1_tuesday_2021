package student_daniel.lesson9.level3;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    //Task 6
    void doSomething();

    //Uncomment void doSomethingMore(); to check that FunctionalInterface allows only one abstract method
    //void doSomethingMore();

    /*
    Функциональный интерфейс в Java – это интерфейс, который содержит только 1 абстрактный метод.
    Основное назначение – использование в лямбда выражениях и method reference.
    Наличие 1 абстрактного метода - это единственное условие,
    таким образом функциональный интерфейс может содержать так же default и static методы.
    */
}
