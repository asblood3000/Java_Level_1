package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public boolean isSatiety () {
        return satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety = true;
        System.out.println("Теперь кот сыт");
    }

    public void info() {
        System.out.println("К тарелке подходит кот " + name + ". Ему нужно " + appetite + " еды.");
    }
}