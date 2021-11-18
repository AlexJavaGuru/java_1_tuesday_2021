package student_julija_kuzmicova.lesson_9.level_3;

import java.util.Optional;

//Task_10
interface ProductDatabaseOptional {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
