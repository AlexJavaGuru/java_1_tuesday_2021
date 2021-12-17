package student_sergej_pereligin.lesson_10.level_2;


class ConstructorChaining { //Task_10

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);
    }


}
