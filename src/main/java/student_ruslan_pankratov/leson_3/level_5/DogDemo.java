package student_ruslan_pankratov.leson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Ber", 777, "Black");
        dog.voice();
        dog.happyBirthday();
        dog.changeColor("Brown");
        dog.voice();
    }
}
