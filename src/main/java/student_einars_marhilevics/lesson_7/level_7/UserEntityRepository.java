package student_einars_marhilevics.lesson_7.level_7;

import java.util.ArrayList;
import java.util.List;

class UserEntityRepository {
    public static List<UserEntity> userEntities = new ArrayList<>();

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
        return users;
    }

    public UserEntity[] getAllUsers() {
        UserEntity[] users = new UserEntity[userEntities.toArray().length];
        for (int i = 0; i < userEntities.toArray().length; i++) {
            users[i] = userEntities.get(i);
        }
        return users;
    }

    public void refactorUser(UserEntity user, String firstName, String lastName, int id, int personalCode) {
        user.setiD(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPersonalCode(personalCode);
    }

    public void deleteUser(int id) {
        userEntities.remove(getUserById(id));
    }
}
