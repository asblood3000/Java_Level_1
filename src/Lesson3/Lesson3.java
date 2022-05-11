package Lesson3;

public class Lesson3 {
    public static void main(String[] args) {
    }

    public static void change0To1 () {
        int[] massiv = {1, 0, 1, 0, 1};
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]==1) {
                massiv[i]=0;
            } else {
                massiv[i]=1;
            }
            System.out.println(massiv[i]);
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }

    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.println(arr[i]);
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.print("\b\b]");
            System.out.println();
        }
        System.out.println();
    }

    public static void returnLengthArray() {
        int len = 3;
        int initialValue = 3333;
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
            System.out.println(arr[i]);
        }
    }
}
