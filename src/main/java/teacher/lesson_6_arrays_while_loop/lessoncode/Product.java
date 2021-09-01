package teacher.lesson_6_arrays_while_loop.lessoncode;

public class Product {

    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    static int calcPrice() {
        return 5 + 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
