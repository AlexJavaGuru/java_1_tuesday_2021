package student_einars_marhilevics.lesson_7.level_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class UserEntityRepository {
    public static List<UserEntity> userEntities = new ArrayList<>();
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
    public void addUser(UserEntity userEntity) {
        userEntities.add(userEntity);
    }
    public UserEntity getUserById(int id) {
        for (int i = 0; i < userEntities.toArray().length; i++) {
            if ((userEntities.get(i).getiD()) == id) {
                return userEntities.get(i);
            }
        }
        return null;
    }
    public UserEntity[] getUsersByName(String name) {
        UserEntity[] users = new UserEntity[userEntities.toArray().length];
        int counter = 0;
        for (int i = 0; i < userEntities.toArray().length; i++) {
            if (userEntities.get(i).getFirstName().equals(name)) {
                users[counter] = userEntities.get(i);
                counter++;
            }
        }
        return Arrays.copyOf(users, counter);
    }
    public UserEntity[] getAllUsers() {
        UserEntity[] users = new UserEntity[userEntities.toArray().length];
        for (int i = 0; i < userEntities.toArray().length; i++) {
            users[i] = userEntities.get(i);
        }
        return users;
    }
    public void refactorUser(int id, String edit, String newName) {
        switch (edit) {
            case "first name": {
                getUserById(id).setFirstName(newName);
            }
            case "last name": {
                getUserById(id).setLastName(newName);
            }
        }
    }
    public void deleteUser(int id) {
        userEntities.remove(getUserById(id));
    }
}
