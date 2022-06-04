package Lesson7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке: " + food + " еды");
    }

    public void decreaseFood(int n) {
        if (n <= food) {
            food -= n;
            System.out.println("Кот съел " + n + " еды");
        }
        else {
            System.out.println("Коту не хватает еды, покорми кота!!!");
            insertFood();
            decreaseFood(n);
        }
    }

    public void insertFood() {
        this.food += 100;
        System.out.println("Добавили в тарелку " + this.food + " еды.");
    }
}
