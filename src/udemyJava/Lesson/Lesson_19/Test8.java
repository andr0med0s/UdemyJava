package udemyJava.Lesson.Lesson_19;

public class Test8 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int b : array) { // с помощью foreach loop-а мы не можем проводить динамическую инициализацию массива
            b = 10;           // т.е придать значения элементам массива
        }

/*
*         for(int i = 0; i < array.length; i++) {
            array [i] = i * 10;
        }
* */

        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
