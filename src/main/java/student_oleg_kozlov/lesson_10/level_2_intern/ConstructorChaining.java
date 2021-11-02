package student_oleg_kozlov.lesson_10.level_2_intern;

// Task_10
class ConstructorChaining {
    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);
        this.constructorName = constructorName;
        this.parameterCount = parameterCount;
    }
}
