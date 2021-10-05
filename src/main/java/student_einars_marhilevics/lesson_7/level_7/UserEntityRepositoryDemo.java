package student_einars_marhilevics.lesson_7.level_7;

import java.util.Arrays;

public class UserEntityRepositoryDemo {
    public static void main(String[] args) {
        UserEntityRepository userEntityRepository = new UserEntityRepository();
        UserEntity userEntityOne = new UserEntity(1, "John", "Week", 12345);
        UserEntity userEntityTwo = new UserEntity(2,"Silvester","Stallone",54321);
        userEntityRepository.addUser(userEntityOne);
        userEntityRepository.addUser(userEntityTwo);
        System.out.println(userEntityRepository.getUserById(1));
        System.out.println(userEntityRepository.getUserById(2));
        System.out.println("");
        System.out.println(Arrays.toString(userEntityRepository.getUsersByName("John")));
        System.out.println(Arrays.toString(userEntityRepository.getUsersByName("Silvester")));
        System.out.println("");
        System.out.println(Arrays.toString(userEntityRepository.getAllUsers()));
        System.out.println("");
        userEntityRepository.deleteUser(2);
        System.out.println(Arrays.toString(userEntityRepository.getAllUsers()));

    }
}
