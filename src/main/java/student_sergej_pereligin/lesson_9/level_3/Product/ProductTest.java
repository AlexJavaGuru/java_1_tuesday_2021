package student_sergej_pereligin.lesson_9.level_3.Product;


import java.util.Arrays;

public class ProductTest {
    public static void main(String[] args) {
        ProductTest productTest = new ProductTest();
        productTest.testSave();
    }

    void testSave() {
//create products (String)
        Product pencil = new Product("Pencil");
        Product scissors = new Product("Scissors");
        Product paper = new Product("Paper");


//pack into an array
        Product[] stationaryStuff = {pencil, scissors, pencil};

//Assign array into the database object
        InMemoryDatabaseImpl inMemoryDatabase = new InMemoryDatabaseImpl(stationaryStuff);

//save stuff into database(that will use an array)
//        inMemoryDatabase.save(pencil);
//        inMemoryDatabase.save(scissors);
//        inMemoryDatabase.save(paper);

        System.out.println(Arrays.toString(stationaryStuff));
    }

}
