package student_alberts_matrozis.lesson_7.level_7;

class UserEntity {
    private int id;
    private String name;
    private String surname;
    private int personalCode;

    public UserEntity(int id, String name, String surname, int personalCode) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.personalCode = personalCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personalCode=" + personalCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return getId() == that.getId() && getPersonalCode() == that.getPersonalCode() && getName().equals(that.getName()) && getSurname().equals(that.getSurname());
    }

}
