// Task 18, 19, 20, 21, 22

package student_olga_urek.Lesson_3.level_5;

class DoggoDemo {
    public static void main(String[] args) {
        Doggo myDog = new Doggo("Pluto", 3, "yellow");

        String myDogName = myDog.getName();
        System.out.println("My doggie is called " + myDogName);

        myDog.voiceTwo();
        myDog.voice();
        myDog.happyBirthday();
        myDog.changeColor("white");

        myDog.voiceTwo();


        /* myDog.name = "Snoopy"; не работает, т.к. name has private access, т.е. кличку собаки нелъзя поменять напрямую
        но кличку все еще можно поменять через соответствующий setter;
         */
        myDog.setName("Snoopy");

        myDogName = myDog.getName();
        System.out.println("Now my doggie is called " + myDogName);


    }
}
