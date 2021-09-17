package student_einars_marhilevics.lesson_7.level_7;

class UserEntityRepository {
    public static void main(String[] args) {
        UserEntity[] data = new UserEntity[0];
        UserEntityRepository userEntityRepository = new UserEntityRepository();
        UserEntity userEntityOne = new UserEntity(1, "John", "Week", 12345);
        UserEntity userEntityTwo = new UserEntity(2,"Silvester","Stallone",54321);
    }
    public UserEntity addUser(int iD, String firstName, String lastName, int personalCode) {
        UserEntity user = new UserEntity(iD, firstName, lastName, personalCode);
        return user;
    }
    public UserEntity getUserById(int iD) {

            for (UserEntity user : data) {
                if (user.getiD() == iD) {
                    return user;
                }
            }
            return null;
    }
}
