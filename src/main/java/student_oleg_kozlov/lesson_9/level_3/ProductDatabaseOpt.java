package student_oleg_kozlov.lesson_9.level_3;

import java.util.Optional;

// Task_10
interface ProductDatabaseOpt {
    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
