package Lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Питер", 200, 1);
        Dog dog = new Dog("Пряник", 300, 22);

        cat.infoCat();
        dog.infoDog();

        System.out.println();

        cat.run();
        cat.swimCat();

        System.out.println();

        dog.run();
        dog.swimDog();
    }
}
