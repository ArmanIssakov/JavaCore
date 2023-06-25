package kz.arman.jcore.sample;

import kz.arman.jcore.regular.Employee;
import kz.arman.jcore.regular.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Arman", "Issakov", 26,
                "manager", "+7777777777", 100000);

        Employee employee1 = new Employee("Robert", "Won", 40,
                "UI", "+8888888888", 80000);

        Employee employee2 = new Employee("John", "Break", 54,
                "surveyor", "+9999999999", 90000);

        Employee[] employees = new Employee[] {manager1, employee1, employee2};

        System.out.println("Before");
        for (Employee e: employees)
        {
            e.show();
            System.out.println();
        }

        Manager.salaryUp(employees, 50000);

        System.out.println("After");
        for (Employee e: employees)
        {
            e.show();
            System.out.println();
        }

    }
}
