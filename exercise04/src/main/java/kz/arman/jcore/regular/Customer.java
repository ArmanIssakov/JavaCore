package kz.arman.jcore.regular;

public class Customer {
    public Customer(String name, String lastName, int age, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    private String name;
    private String lastName;
    private int age;
    private String phoneNumber;
    private Gender gender;

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
