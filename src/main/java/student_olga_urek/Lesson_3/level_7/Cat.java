package student_olga_urek.Lesson_3.level_7;

//Task 29

class Cat {
    String name;
    double weight;
    boolean isHungry;
    int miceCaught;

    public Cat(String name, double weight, boolean isHungry, int miceCaught) {
        this.name = name;
        this.weight = weight;
        this.isHungry = isHungry;
        this.miceCaught = miceCaught;
    }

    public void feedCat () {
        this.weight = weight + 0.25;
        this.isHungry = false;
    }

    public void playWithCat () {
        this.weight = weight - 0.1;
        this.isHungry = true;
    }

    public void catchMice () {
        this.miceCaught = miceCaught + 1;
    }

    public void hungerStatus () {
        if(isHungry) {
            System.out.println(name + " is hungry! Please feed the cat!");
        }
        System.out.println(name + " is not hungry... Feed anyway.");
    }
    public void weightStatus () {
        System.out.println(name + " weighs only " + weight + " kilos. Do you feed your cat at all?!");
    }
    public void mouseRecord () {
        System.out.println(name + " has caught " + miceCaught + " mice!");
    }
}
