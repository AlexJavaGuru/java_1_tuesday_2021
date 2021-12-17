package student_sergej_pereligin.lesson_9.level_3.Product;


public interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}
