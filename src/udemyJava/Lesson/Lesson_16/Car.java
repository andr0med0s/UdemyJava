package udemyJava.Lesson.Lesson_16;

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;

    public Car abc(String cvet) {
        Car c10 = new Car(cvet, "v4");
        return c10;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "v6");
        c.abc("black");
        System.out.println(c.color);
    }
}


/*
* class TestCar {
     final static Car c = new Car("Red", "V8"); // с final и ссылаться на другой объект уже не может

     public static void main(String[] args) {

         c.color="black";
     }
 }
* */
