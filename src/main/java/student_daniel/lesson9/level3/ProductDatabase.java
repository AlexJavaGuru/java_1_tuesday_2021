package student_daniel.lesson9.level3;

interface ProductDatabase {
    //Task 7 8
    void save(Product product);

    Product findByTitle(String productTitle);
}