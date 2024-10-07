package udemyJava.Lesson.Lesson_26;

import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        Car c1 = new Car("red", "v4");
    //    Car c2 = new Car("red", "v4");
        Car c2 = null;
        Car c3 = new Car("black", "v8");

//        Object c1 = new Car("red", "v4"); // работать не будет потому что будет использоваться
//        Object c2 = new Car("red", "v4"); // метод equals из класса Object, а не из класса Car
//        Object c3 = new Car("black", "v8");

//        System.out.println(c1==c2); false не ссылаются на один  тот же объект

        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        Car c4 = new Car("black", "v8");
      //  System.out.println(list.contains(c4)); // несовпадение параметров для equals метод contains вернет false
                                                //метод contains внутри себя использует метод equals, который имеет
                                                // в параметр list-e object
//        System.out.println(c1.equals(c2)); //true
//        System.out.println(c1.equals(c3)); //false
//        System.out.println(c1.equals(null)); // false
//        System.out.println(c2.equals(c1)); // ошибка
//        System.out.println(c3); // вывод hashcode данного объекта
        System.out.println(c3); // перезапишиv метод toString
        System.out.println(list);
    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
/*
    public boolean equals(Object obj) { // переопределение (overriding) метода equals
        if (obj instanceof Car) {
            Car c2 = (Car) obj;
            return (color.equals(c2.color) && engine.equals(c2.engine));
        } else return false;
    }
    */
public boolean equals(Car c) { // не переопределяется  (overriding) метод equals
                                //список параметров должен быть одинаковым
                                // здесь overloaded (перегрузка) метода equals

    // ! в методе equals нужно использовать параметр типа object !

        return (color.equals(c.color) && engine.equals(c.engine));
    }

    public String toString() {
    return "Mashina cveta " + color + " i s motorom " + engine;
    }
}

