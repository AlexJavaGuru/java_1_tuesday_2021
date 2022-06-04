package student_daniel.lesson10.level2;

public class ConstructorChaining {
    //Task 10
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
