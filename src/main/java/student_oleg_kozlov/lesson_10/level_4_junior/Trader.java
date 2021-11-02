package student_oleg_kozlov.lesson_10.level_4_junior;

// Task_17, Task_18, Task_19, Task_20, Task_21
class Trader {
    private String fullName;
    private String city;
    private String country;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }
}
