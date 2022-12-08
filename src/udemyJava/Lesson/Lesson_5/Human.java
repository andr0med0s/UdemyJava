package udemyJava.Lesson.Lesson_5;

public class Human {
    String name;
    Car3 car;
    BankAccount ba;

    void info() {
        System.out.println("Imya: " + name + " cvet mashini: " + car.color + " Balance bankovskogo scheta: " + ba.balance);
    }

}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name= "David";
        h.car = new Car3("red","v4");
        h.ba = new BankAccount(25, 62.325);
        h.info();
    }
}


class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }

    String color;
    String engine;
}

class BankAccount {
    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }

    int id;
    double balance;
}