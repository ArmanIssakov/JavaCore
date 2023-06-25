package kz.arman.jcore.regular;

public class Employee {
    private String name;
    private String lastName;
    private int age;
    private String position;
    private String phone;
    private int salary;

    public Employee(String name, String lastName, int age, String position, String phone, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void show(){
        System.out.printf("Name: %s, lastname: %s, age: %d, position: %s, phone: %s, salary: %d"
                ,name, lastName, age, position, phone, salary);
    }
}
