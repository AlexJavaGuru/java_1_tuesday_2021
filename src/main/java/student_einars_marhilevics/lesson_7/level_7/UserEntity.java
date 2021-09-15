package student_einars_marhilevics.lesson_7.level_7;

class UserEntity {
    private int iD;
    private String firstName;
    private String lastName;
    private int personalCode;

    public UserEntity(int iD, String firstName, String lastName, int personalCode) {
        this.iD = iD;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalCode = personalCode;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }
}
