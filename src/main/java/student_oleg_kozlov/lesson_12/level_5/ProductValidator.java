package student_oleg_kozlov.lesson_12.level_5;

import java.util.List;

// Task_32, Task_33
interface ProductValidator {
    List<ValidationException> validate(Product product);
}
