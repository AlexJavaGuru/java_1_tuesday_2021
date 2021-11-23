package student_alberts_matrozis.lesson_9.level_3.task_10;

import java.util.Optional;

import static student_alberts_matrozis.albertsUtils.Utils.check;

class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabase database = new InMemoryDatabase();
        Product phone = new Product("Phone");
        Product TV = new Product("TV");

        database.save(phone);
        database.save(TV);

        Optional<Product> findedPhone = database.findByTitle("Phone");
        Optional<Product> findedTV = database.findByTitle("TV");

        findedPhone.ifPresent((data) -> {
            check(data.getTitle().equals("Phone"), true);
        });

        findedTV.ifPresent((data) -> {
            check(data.getTitle().equals("TV"), true);
        });

    }
}
