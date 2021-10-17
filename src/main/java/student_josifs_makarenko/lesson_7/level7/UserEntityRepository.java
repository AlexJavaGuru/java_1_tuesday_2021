package student_josifs_makarenko.lesson_7.level7;

import java.util.Arrays;
import java.util.Scanner;
//task_16
public class UserEntityRepository {

    static UserEntity[] userList;

    void createUser(UserEntity user) {
        UserEntity[] userData;
        if (userList == null) {
            userData = new UserEntity[1];
            userData[0] = user;
        } else {
            userData = new UserEntity[userList.length + 1];
            System.arraycopy(userList, 0, userData, 0, userList.length);
            userData[userList.length] = user;
        }
        userList = userData;
    }

    void changeUser (UserEntity user, String name, String surname, int id, int personalCode) {
        user.setId(id);
        user.setPersonalCode(personalCode);
        user.setSurname(surname);
        user.setName(name);
    }

    void deleteUser(UserEntity user) {
        UserEntity[] temp = new UserEntity[userList.length - 1];
        int j = 0;
        for (UserEntity userEntity : userList) {
            if (userEntity.getId() != user.getId()) {
                temp[j] = userEntity;
                j++;
            }
        }
        userList = temp;
    }

    UserEntity findUserByName(String name) {
        for (UserEntity userEntity : userList) {
            if (userEntity.getName().equals(name)) {
                return userEntity;
            }
        }
        return null;
    }

    UserEntity findUsingSurname(String surname) {
        for (UserEntity userEntity : userList) {
            if (userEntity.getSurname().equals(surname)) {
                return userEntity;
            }
        }
        return null;
    }

    UserEntity findUsingPersonalCode(int personalCode) {
        for (UserEntity userEntity : userList) {
            if (userEntity.getPersonalCode() == personalCode) {
                return userEntity;
            }
        }
        return null;
    }

    UserEntity findUsingId() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input ID");
        int id = scanner.nextInt();

        for (UserEntity userEntity : userList) {
            if (userEntity.getId() == id) {
                return userEntity;
            }
        }
        return null;
    }
}
