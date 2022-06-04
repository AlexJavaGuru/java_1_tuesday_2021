package student_daniel.lesson10.level5;

class Trader {
    //Task 22 23 24 25 26 27 28 29
    private String fullName;
    private String city;
    private String country;

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }
}