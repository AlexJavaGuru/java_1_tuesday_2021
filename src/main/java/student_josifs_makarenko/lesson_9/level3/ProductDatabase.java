package student_josifs_makarenko.lesson_9.level3;
//task 8
public interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);
}
