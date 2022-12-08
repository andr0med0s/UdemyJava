package udemyJava.Lesson.Lesson_5;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }
    int tormoz(int skorost){
        speed -= skorost;
        return speed;
    }
    void showInfo(){
        System.out.println("cvet: " +color+ "  " + "motor: " + engine + " " + "skorost: " + speed); // вывод на экран это не оутпут
     }
}
class Car2Test{
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.engine = "v6";
        c1.speed = 60;

        c1.showInfo();
        c1.gaz(21);
        c1.showInfo();
        c1.tormoz(13);
        c1.showInfo();

        System.out.println("__________________");

        Car2 c2 = new Car2();
        c2.color = "green";
        c2.engine = "v8";
        c2.speed = 80;

        c2.showInfo();
        c2.gaz(53);
        c2.showInfo();
        c2.tormoz(22);
        c2.showInfo();
    }
}
