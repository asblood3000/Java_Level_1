package Lesson5;

public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String printEmployee() {
        return name + " возраст " + age;
    }
}
