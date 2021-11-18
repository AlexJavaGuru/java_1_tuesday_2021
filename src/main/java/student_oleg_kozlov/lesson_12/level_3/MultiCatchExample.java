package student_oleg_kozlov.lesson_12.level_3;

/*
При использовании нескольких блоков catch, их анализ идет в порядке появления
в коде и сработает первый соответствующий. Это означает, что более
специфические исключения должны отлавливаться раньше, чем более общие. Иначе,
более специфические никогда не отработают. В нашем случае, ArithmeticException
является потомком RuntimeException, который в свою очередь, является потомком
Exception. То есть исключение Exception является более обобщенным.
 */

// Task_20
class MultiCatchExample {
    public static void main(String[] args) {
        try {

        } catch (ArithmeticException e) {

        } catch (Exception a) {

        }
    }
}
