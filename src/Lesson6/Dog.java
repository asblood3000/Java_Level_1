package Lesson6;

public class Dog extends Animal {
    public Dog(String name, int runDist, int swimDist) {
        super(name, runDist, swimDist);
        this.type = "Собака";
        this.maxRun = 500;
        this.maxSwimDog = 10;
    }
}
