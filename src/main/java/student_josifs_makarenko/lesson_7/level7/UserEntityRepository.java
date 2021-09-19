package student_josifs_makarenko.lesson_7.level7;

import java.util.Arrays;
import java.util.Scanner;
//task_16
public class UserEntityRepository {

    static UserEntity[] userList;

    public static void main(String[] args) {
        UserEntityRepository userEntityRepository = new UserEntityRepository();
        UserEntity user1 = new UserEntity("Dima", "Ivanov", 12345678);
        UserEntity user2 = new UserEntity("Josifs", "Makarenko", 87654321);
        UserEntity user3 = new UserEntity("Andrey", "Sidorov", 12346325);
        UserEntity user4 = new UserEntity("Ivan", "Andreev", 1245446);
        UserEntity user5 = new UserEntity("Misha", "Mihailov", 3434221);


        userEntityRepository.createUser(user1);
        userEntityRepository.createUser(user2);
        userEntityRepository.createUser(user3);
        userEntityRepository.createUser(user4);
        userEntityRepository.createUser(user5);

        System.out.println(Arrays.toString(userList).replace("[", "").replace("]", ""));

        userEntityRepository.changeUser(user5, "Piter", "Peytrov", 1234, 1234535321);
        System.out.println(Arrays.toString(userList).replace("[", "").replace("]", ""));

        userEntityRepository.deleteUser(user1);
        System.out.println(Arrays.toString(userList).replace("[", "").replace("]", ""));

        System.out.println(userEntityRepository.findUsingName("Ivan"));
        System.out.println(userEntityRepository.findUsingSurname("Peytrov"));
        System.out.println(userEntityRepository.findUsingPersonalCode(87654321));
        System.out.println(userEntityRepository.findUsingId());
    }

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

    UserEntity findUsingName(String name) {
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
