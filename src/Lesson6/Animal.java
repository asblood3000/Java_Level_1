package Lesson6;

public class Animal {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwimDog;
    protected int maxSwimCat;
    protected int runDist;
    protected int swimDist;

    public Animal(String name, int runDist, int swimDist){
        this.name = name;
        this.runDist = runDist;
        this.swimDist = swimDist;
    }

    public void infoDog() {
        System.out.println(this.type + " " + this.name + " может пробежать " + this.maxRun + " метров, проплыть " + this.maxSwimDog + " метров");
    }

    public void infoCat() {
        System.out.println(this.type + " " + this.name + " может пробежать " + this.maxRun + " метров, проплыть " + this.maxSwimCat + " метров - коты не плавают!");
    }

    public void run() {
        System.out.println("Бег:");
        if (this.runDist <= this.maxRun && this.runDist >= 0) {
            System.out.println(this.type + " " + this.name + " пробежал(а) " + this.runDist + " метров");
        }
        else if (this.runDist < 0) {
            System.out.println("Расстояние не может быть отрицательным");
        }
        else {
            System.out.println(this.type + " " + this.name + " не может бегать так далеко.");
        }
    }

    public void swimDog() {
        System.out.println("Плавание:");
        if (this.swimDist <= this.maxSwimDog && this.swimDist >= 0) {
            System.out.println(this.type + " " + this.name + " проплыл(а) " + this.swimDist + " метров");
        }
        else if (this.swimDist < 0) {
            System.out.println("Расстояние не может быть отрицательным");
        }
        else {
            System.out.println(this.type + " " + this.name + " не может плавать так далеко.");
        }
    }

    public void swimCat() {
        System.out.println("Плавание:");
        if (this.swimDist >= 0) {
            System.out.println("Коты не умеют плавать!");
        }
        else {
            System.out.println("Расстояние не может быть отрицательным");
        }
    }
}
