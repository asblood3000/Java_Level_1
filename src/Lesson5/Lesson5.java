package Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        int baseAge = 40;
        Employee[] person = new Employee[5];
        person[0] = new Employee("Иванов Иван Иванович", "Директор", "ivanovii@mycompany.ru", "+7(911)111-11-11", 200000, 35);
        person[1] = new Employee("Петров Петр Петрович", "Заместитель директора", "petrovpp@mycompany.ru", "+7(922)222-22-22", 170000, 41);
        person[2] = new Employee("Сидоров Сидор Сидорович", "Старший менеджер", "sidorovss@mycompany.ru", "+7(933)333-33-33", 130000, 31);
        person[3] = new Employee("Тарасов Тарас Тарасович", "Инженер", "tarasovtt@mycompany.ru", "+7(944)444-44-44", 150000, 44);
        person[4] = new Employee("Сергеев Сергей Сергеевич", "QA инженер", "sergeevss@mycompany.ru", "+7(955)555-55-55", 120000, 30);

        System.out.println("Список сотрудников с возрастом более 40 лет:");
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > baseAge) {
                System.out.println(person[i].printEmployee());
            }
        }
    }
}
