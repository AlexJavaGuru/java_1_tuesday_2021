package student_einars_marhilevics.lesson_9.level_3;

import java.util.Optional;

interface ProductDatabaseOptional {
    void save(Product product);
    Optional<Product> findByTitle(String productTitle);
}
