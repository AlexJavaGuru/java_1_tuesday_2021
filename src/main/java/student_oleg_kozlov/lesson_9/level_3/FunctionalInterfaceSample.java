package student_oleg_kozlov.lesson_9.level_3;

// Task_6
@FunctionalInterface
interface FunctionalInterfaceSample {
    /*
     Функциональный интерфейс (functional interface) – это интерфейс у которого
     только один абстрактный метод. Функциональный интерфейс может содержать любое
     количество методов по умолчанию (default) или статических методов.
     Основное назначение – использование в лямбда выражениях.
     */
    void displayMessage();
}
