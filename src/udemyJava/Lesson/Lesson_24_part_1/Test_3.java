package udemyJava.Lesson.Lesson_24_part_1;

public class Test_3 {
    public static void main(String[] args) {
       // Help_able h = new Help_able(); невозможно создать объект interface (это не класс)как и абстрактного класса
        Help_able h = new Driver();
        Swim_able s = new Driver(); // так же на объект Driver может ссылаться переменная типа Swim_able
                                    //потому что класс Driver implement-ировал оба эти interface
        Employee e = new Driver();
        System.out.println(h.a);
        //System.out.println(h.salary); в Help_able нет const salary
        h.pomosh();
        h.tushitPojar("voda");
//        h.eat(); //невозможно вызвать потому что этих методов нет в переменной h типа Help_able
//        h.vodit();
        s.swim();
    }
}

class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int expirience;
    void eat() {
        System.out.println("Кушать");
    }
    void sleep() {
        System.out.println("Спать");
    }
}

class Driver extends Employee implements Help_able, Swim_able {
    String nazvaniemashiny;
    void vodit() {
        System.out.println("Водит");
    }

    public void pomosh(){  // если overriding метод interface, то он должен быть public
        System.out.println("Voditel okazivaet pomosh");
//        System.out.println(a); так можно написать
        //      a = 3; так нельзя так как a является константой+

    }
    public void tushitPojar(String s){  // если overriding метод interface, то он должен быть public
        System.out.println("Voditel tushit pojar s pomowyu " + s);
    }
    public void swim(){  // если overriding метод interface, то он должен быть public
        System.out.println("Voditel plavaet");
    }
}

//abstract class Teacher extends Employee implements Help_able{
 class Teacher extends Employee implements Help_able{
    //класс Teacher правильно implement-ировал interface и перезаписал все его методы
    //если не перезаписывает все методы, тогда он должен быть abstract
    int kolichestvouchenikov;
    void uchit() {
        System.out.println("Учить");
    }
    public void pomosh(){  // если overriding метод interface, то он должен быть public
        System.out.println("Uchitel okazivaet pomosh");
    }
    public void tushitPojar(String s){  // если overriding метод interface, то он должен быть public
        System.out.println("Uchitel tushit pojar s pomowyu " + s);
    }
}



interface Help_able{ // компилятор добавит abstract в определение interface
//    Help_able(){} у interface нет конструкторов .. Он interface не может создавать объекты
    public abstract void pomosh(); // interface может содержать только abstract методы!! JAVA 7 !!
    //все abstract методы в interface являются public
    //void tushitPojar();
    void tushitPojar(String predmet); //изменив в interface сигнатуру метода, мы должны менять сигнатуру метода
                                     //в классах которые implement-ируют данный interface
    int a = 10; // по дефолту компилятор добавляет public final static
}

interface Swim_able{
    void swim();
}

abstract class Y implements  Swim_able{}
abstract class X extends Y{}
 class Z extends Y{
    public void  swim(){

    }
 }




