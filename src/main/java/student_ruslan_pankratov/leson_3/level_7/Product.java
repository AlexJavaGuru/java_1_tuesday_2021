package student_ruslan_pankratov.leson_3.level_7;

//Task_31
 class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    double actualPrice() {
        double result = regularPrice - ((regularPrice / 100) * discount);
        return result;
    }

    void printInformation() {
        System.out.println("Цена продукта без скидки: " + regularPrice + " EUR");
        System.out.println("Сегодня скидка: " + discount + "%");
        System.out.println("Цена со скидкой: " + actualPrice() + " EUR");
    }
}


