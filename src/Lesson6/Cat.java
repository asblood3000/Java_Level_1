package Lesson6;

public class Cat extends Animal {
    public Cat(String name, int runDist, int swimDist) {
        super(name, runDist, swimDist);
        this.type = "Кот";
        this.maxRun = 200;
        this.maxSwimCat = 0;
    }
}
