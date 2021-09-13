package student_ruslan_pankratov.lesson_7.level_7;

import java.util.Arrays;
//Task_16

class RepositoryUser {

    static UserEntity[] userEntities;

    public static void main(String[] args) {
        RepositoryUser repositoryUser = new RepositoryUser();
        UserEntity userEntity = new UserEntity(1, "Jhon", "Bil", 578234);
        UserEntity userEntityTwo = new UserEntity(2, "Jim", "Staley", 578278);
        UserEntity userEntityThree = new UserEntity(3, "Miler", "Or", 578299);
        UserEntity userEntityFour = new UserEntity(4, "David", "Vir", 574534);
        UserEntity userEntityFive = new UserEntity(5, "Lisa", "Kirova", 576734);
        UserEntity userEntitySix = new UserEntity(6, "Alisa", "Mironova", 678594);
        repositoryUser.saveUser(userEntity);
        repositoryUser.saveUser(userEntityTwo);
        repositoryUser.saveUser(userEntityThree);
        repositoryUser.saveUser(userEntityFour);
        repositoryUser.saveUser(userEntityFive);
        repositoryUser.saveUser(userEntitySix);
        System.out.println(repositoryUser.gettingUserById(2, userEntities));
        System.out.println(repositoryUser.getName("Lisa", userEntities));
        System.out.println("Все пользователи");
        System.out.println(Arrays.toString(userEntities));
        repositoryUser.userEditing(3, "Nil", "Vazovski", 123, userEntityThree);
        System.out.println("Все пользователи");
        System.out.println(Arrays.toString(userEntities));
        repositoryUser.deleteUser(userEntityThree, userEntities);

        System.out.println("Все пользователи");
        System.out.println(Arrays.toString(userEntities));
    }

    void saveUser(UserEntity userSave) {
        UserEntity[] user;
        if (userEntities == null) {
            user = new UserEntity[1];
            user[0] = userSave;
            userEntities = user;
        } else {
            user = new UserEntity[userEntities.length + 1];
            for (int i = 0; i < userEntities.length; i++) {
                user[i] = userEntities[i];
            }
            user[userEntities.length] = userSave;
            userEntities = user;
        }
    }

    UserEntity gettingUserById(int idUser, UserEntity[] userEntity) {
        for (int i = 0; i < userEntity.length; i++) {
            if (userEntity[i].getId() == idUser) {
                return userEntity[i];
            }
        }
        return null;
    }

    UserEntity getName(String name, UserEntity[] userEntity) {
        for (int i = 0; i < userEntity.length; i++) {
            if (userEntity[i].getName() == name) {
                return userEntity[i];
            }
        }
        return null;
    }


    void userEditing(int id, String name, String surname, int privateIdintifier, UserEntity userEntity) {
        UserEntity user = userEntity;
        user.setId(id);
        user.setName(name);
        user.setSurname(surname);
        user.setPrivateIdentifier(privateIdintifier);

//
    }

    void deleteUser(UserEntity deleteUser, UserEntity[] arr) {
        UserEntity[] userTemporary = new UserEntity[arr.length - 1];
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId() != deleteUser.getId()) {
                userTemporary[size] = arr[i];
                size++;
            }
        }
        userEntities = userTemporary;


    }

    @Override
    public String toString() {
        return "RepositoryUser{" +
                "userEntities=" + Arrays.toString(userEntities) +
                '}';
    }
}
