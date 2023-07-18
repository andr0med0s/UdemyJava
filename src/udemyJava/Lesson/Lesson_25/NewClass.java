package udemyJava.Lesson.Lesson_25;

public class NewClass {

}

class Car{
    static int a=5;

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.a);
        c=null;  // здесь нет разницы на какой объект ссылается с, но если бы с была
                    // бы не static то разница была бы
        System.out.println(c.a);
    }
}
