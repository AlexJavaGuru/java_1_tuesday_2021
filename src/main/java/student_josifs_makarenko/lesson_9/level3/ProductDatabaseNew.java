package student_josifs_makarenko.lesson_9.level3;

import java.util.Optional;

//task 8
public interface ProductDatabaseNew {

    void save(ProductNewVersion product);

    Optional<ProductNewVersion> findByTitle(String productTitle);
}
