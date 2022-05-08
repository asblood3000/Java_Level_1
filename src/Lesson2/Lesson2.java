package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(checkSum10to20(10, 10));
        checkPositivOrNegativ(-1);
        System.out.println(checkNumber(-66));
        printString("Вася", 5);
        System.out.println(checkingLeapYear(2004));
    }

    public static boolean checkSum10to20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkPositivOrNegativ(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkNumber(int a) {
        if (a < 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void printString(String word, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(word);
        }
    }

    public static boolean checkingLeapYear(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
