package student_sergej_pereligin.lesson_9.level_3;

@java.lang.FunctionalInterface
// it is suggested to have an annotation to make sure that the structure of
//functional interface is maintained


public interface FunctionalInterface {
    //In java 8 you can have implemented methods in interfaces.
    //For an interface to be considered as a type for lambda expression, it has to have only ONE abstract method.
    //Though it can also have several implemented methods.
    //Such an interface can be called a Functional interface.
    //You can add a second abstract method to the interface, it should still work, but it won't be considered a
    //functional interface anymore. And lambda expressions won't work anymore too.




    public void sayHello(String string);


}


