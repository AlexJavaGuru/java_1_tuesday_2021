package student_ruslan_pankratov.lesson_7.level_7;

//Task_16

class UserEntity {

    private int id;
    private String name;
    private String surname;
    private int privateIdentifier;

    public UserEntity(int id, String name, String surname, int privateIdintifier) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.privateIdentifier = privateIdintifier;
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

    public int getPrivateIdentifier() {
        return privateIdentifier;
    }

    public void setPrivateIdentifier(int privateIdentifier) {
        this.privateIdentifier = privateIdentifier;
    }


    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", privateIdentifier=" + privateIdentifier +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity)) return false;
        UserEntity that = (UserEntity) o;
        return getId() == that.getId() && getPrivateIdentifier() == that.getPrivateIdentifier() && getName().equals(that.getName()) && getSurname().equals(that.getSurname());
    }


}
