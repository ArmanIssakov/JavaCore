package kz.arman.jcore.regular;

public class Manager extends Employee{

    public Manager(String name, String lastName, int age, String position, String phone, int salary) {
        super(name, lastName, age, position, phone, salary);
    }

    public static void salaryUp(Employee[] employees, int salaryIncrease){
        for (int i = 0; i < employees.length; i++){
            if(!(employees[i] instanceof Manager)){
                employees[i].setSalary(employees[i].getSalary() + salaryIncrease);
            }
        }
    }
}
