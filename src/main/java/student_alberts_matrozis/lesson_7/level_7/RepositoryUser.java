package student_alberts_matrozis.lesson_7.level_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RepositoryUser {

    public static List<UserEntity> userEntities = new ArrayList<>();

    public static void main(String[] args) {
        RepositoryUser repositoryUser = new RepositoryUser();
        UserEntity userOne = new UserEntity(1, "Misha", "Pituh", 58379);
        UserEntity userTwo = new UserEntity(2, "Alberts", "Matrozis", 58694);
        UserEntity userThree = new UserEntity(3, "John", "Smith", 84934);
        UserEntity userFour = new UserEntity(4, "Liza", "Simpson", 94724);
        UserEntity userFive = new UserEntity(5, "Barth", "Simpson", 32134);
        repositoryUser.saveUserEntity(userOne);
        repositoryUser.saveUserEntity(userTwo);
        repositoryUser.saveUserEntity(userThree);
        repositoryUser.saveUserEntity(userFour);
        repositoryUser.saveUserEntity(userFive);
        System.out.println(repositoryUser.getUserById(1));
        System.out.println(Arrays.toString(repositoryUser.getUsersByName("Misha")));
        System.out.println(Arrays.toString(repositoryUser.getAllUsers()));
        repositoryUser.deleteUser(2);
        System.out.println(repositoryUser.getUserById(2));
    }

    public void saveUserEntity(UserEntity userEntity) {
        userEntities.add(userEntity);
    }

    public UserEntity getUserById(int id) {
        for (int i = 0; i < userEntities.toArray().length; i++) {
            if ((userEntities.get(i).getId()) == id) {
                return userEntities.get(i);
            }
        }
        return null;
    }

    public UserEntity[] getUsersByName(String name) {
        UserEntity[] users = new UserEntity[userEntities.toArray().length];
        int counter = 0;
        for (int i = 0; i < userEntities.toArray().length; i++) {
            if (userEntities.get(i).getName().equals(name)) {
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

    public void refactorUser(int id, String edit, String value) {
        switch (edit) {
            case "name": {
                getUserById(id).setName(value);
            }
            case "surname": {
                getUserById(id).setSurname(value);
            }
        }
    }

    public void refactorUser(int id, String edit, int value) {
        switch (edit) {
            case "id": {
                getUserById(id).setId(value);
            }
            case "personalCode": {
                getUserById(id).setPersonalCode(value);
            }
        }
    }

    public void deleteUser(int id) {
        userEntities.remove(getUserById(id));
    }
}