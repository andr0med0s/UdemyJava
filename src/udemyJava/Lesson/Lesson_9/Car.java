package udemyJava.Lesson.Lesson_9;

public class Car {
    String color;
    public static int ab = 10;
    String engine;
    public static int count;

    // public static void changeA(int b){
    // Car с = new Car("black", "v8");
    // c.a=b;
    // }

    public Car(String color, String engine) {

        this.color = color;
        this.engine = engine;

    }

    // System.out.println(this.color);color =color;




    public static void main(String[] args) {
        Car c = new Car("red", "V6");
        int a = 10;
        // a=a; a=10
    }

}
