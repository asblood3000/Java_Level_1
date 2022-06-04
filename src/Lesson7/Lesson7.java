package Lesson7;

public class Lesson7 {
    public static void main(String[] args) {
            Cat[] cat = new Cat[2];
            cat[0] = new Cat("Том", 25);
            cat[1] = new Cat("Питер", 85);
            Plate plate = new Plate(100);
            for (int i = 0; i < cat.length; i++) {
                cat[i].info();
                plate.info();
                cat[i].eat(plate);
                System.out.println();
            }
    }
}
