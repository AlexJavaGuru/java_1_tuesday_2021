package student_josifs_makarenko.lesson10.level2;

public class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }


    public ConstructorChaining(String constructorName, int parameterCount) {
        ConstructorChaining c = new ConstructorChaining(constructorName);
        this.constructorName = constructorName;
        this.parameterCount = parameterCount;
    }
}
