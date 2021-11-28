package student_sergej_pereligin.lesson_9.level_3;


public class task_7 {

    interface ProductDatabase {

        void save(Product product);

        Product findByTitle(String productTitle);

    }

    //Это не функциональный интерфейс, поскольку у него два абстрактных метода.

    class Product {

        private String title;

        public Product(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

    }
}
