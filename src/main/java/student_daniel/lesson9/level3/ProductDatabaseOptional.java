package student_daniel.lesson9.level3;

import java.util.Optional;

public interface ProductDatabaseOptional {
    //Task 10
    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
