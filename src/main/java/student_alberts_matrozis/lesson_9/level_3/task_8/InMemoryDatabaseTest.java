package student_alberts_matrozis.lesson_9.level_3.task_8;

import static student_alberts_matrozis.albertsUtils.Utils.*;

class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabase database = new InMemoryDatabase();
        Product Phone = new Product("Phone");
        Product TV = new Product("TV");

        database.save(Phone);
        database.save(TV);

        Product findedPhone = database.findByTitle("Phone");
        Product findedTV = database.findByTitle("TV");
        Product notFindedTesla = database.findByTitle("Tesla");

        check(findedPhone.getTitle().equals("Phone"), true);
        check(findedTV.getTitle().equals("TV"), true);
        check(notFindedTesla == null, true);
    }
}
