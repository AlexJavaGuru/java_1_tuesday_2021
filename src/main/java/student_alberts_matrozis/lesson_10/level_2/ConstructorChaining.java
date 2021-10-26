package student_alberts_matrozis.lesson_10.level_2;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(int parameterCount, String constructorName) {
        this(constructorName);
        this.parameterCount = parameterCount;
    }
}
