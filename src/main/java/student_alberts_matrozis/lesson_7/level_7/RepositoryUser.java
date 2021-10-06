package student_alberts_matrozis.lesson_7.level_7;

import java.util.ArrayList;
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
        UserEntity userSix = new UserEntity(6, "Misha", "Smith", 1337228);

        repositoryUser.saveUserEntity(userOne);
        repositoryUser.saveUserEntity(userTwo);
        repositoryUser.saveUserEntity(userThree);
        repositoryUser.saveUserEntity(userFour);
        repositoryUser.saveUserEntity(userFive);
        repositoryUser.saveUserEntity(userSix);

        System.out.println(repositoryUser.getUserById(1));
        repositoryUser.deleteUser(2);
        System.out.println(repositoryUser.getUserById(2));
        System.out.println(repositoryUser.getUsersByName("Misha"));
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

    public List<UserEntity> getUsersByName(String name) {
        List<UserEntity> users = new ArrayList<UserEntity>();
        for (int i = 0; i < userEntities.toArray().length; i++) {
            if (userEntities.get(i).getName().equals(name)) {
                users.add(userEntities.get(i));
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

    public void refactorUser(int id, UserEntity newUser) {
        UserEntity user = getUserById(id);

        user.setName(newUser.getName());
        user.setSurname(newUser.getSurname());
        user.setPersonalCode(newUser.getPersonalCode());
        user.setId(newUser.getId());
    }

    public void deleteUser(int id) {
        userEntities.remove(getUserById(id));
    }
}