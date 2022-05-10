package Lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        //change0To1();
        //fillArray();
        myMassiv();
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

    public static void myMassiv() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }
}
