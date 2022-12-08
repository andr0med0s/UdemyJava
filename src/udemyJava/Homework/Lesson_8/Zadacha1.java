package Homework.Lesson_8;

public class Zadacha1 {
    static double multiplication(double a, double b, double c) {
        return a * b * c;
    }

    static void division(int d, int f) {
        System.out.println("Целое частное = " + d / f + " остаток = " + d % f);
    }

}

class Zadacha1Test {

    public static void main(String[] args) {

        System.out.println(Zadacha1.multiplication(3, 4, 5));
        Zadacha1.division(9, 6);

        System.out.println(Zadacha1.multiplication(3.3, 4.4, 5.5));
        Zadacha1.division(15, 4);

    }
}
