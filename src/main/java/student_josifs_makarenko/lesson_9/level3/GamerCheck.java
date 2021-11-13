package student_josifs_makarenko.lesson_9.level3;

import java.util.function.Predicate;
//task 6
@java.lang.FunctionalInterface
public interface GamerCheck {
    boolean isPlayer(String key);
}
/*
Функциональный интерфейс в Java – это интерфейс, который содержит только 1 абстрактный метод.
Основное назначение – использование в лямбда выражениях и method reference.
 */