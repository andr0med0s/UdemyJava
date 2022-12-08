package Homework.Lesson_8;

public class Zadacha2 {

    public final static double PI = 3.14;

    public double square(double radius) {
        double pl = PI * radius * radius;
        return pl;
    }

    public static double circumference(double radius2) {
        double cf = 2 * PI * radius2;
        return cf;
    }

    public void info(double radius3) {
        System.out.println("Радиус равен = " + radius3);
        System.out.println("Площадь круга = " + square(radius3));
        System.out.println("Длина окружности = " + circumference(radius3));
    }
}

class Zadacha2Test {

    public static void main(String[] args) {
        Zadacha2 z = new Zadacha2();
        z.square(15); // non static method создается объект Zadacha2 z = new Zadacha2();
        Zadacha2.circumference(7.5); // static
        z.info(3); // static

    }

}