package udemyJava.Lesson.Lesson_22;

public class Test3 {
    void uvelichenieZp(Employee e) {
        e.salary = e.salary + 100;
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.expirience = 25;
//        doc.specializaciya = "hirurg";
        doc.eat();
        doc.sleep();
        doc.lechit();

    }
}

class Employee extends java.lang.Object {
    double salary = 100;
    String name;
    int age;
    int expirience;

    void eat() {
        System.out.println("Кушать");
    }

    void sleep() {
        System.out.println("Спать");
    }
}

//class Doctor {
//    String name;
//    int age;
//    int expirience;
//    String specializaciya;
//
//    void eat() {
//        System.out.println("Кушать");
//    }
//
//    void sleep() {
//        System.out.println("Спать");
//    }
//
//    void lechit() {
//        System.out.println("Лечить");
//    }
//}


class Doctor extends Employee {
//    String specializaciya;

    void lechit() {
        System.out.println("Лечить");
    }



    class Dantist extends Doctor{
        String skallpel;
        void operacccccciya(){}
    }
}

//class Teacher {
//    String name;
//    int age;
//    int expirience;
//    int kolichestvouchenikov;
//
//    void eat() {
//        System.out.println("Кушать");
//    }
//
//    void sleep() {
//        System.out.println("Спать");
//    }
//
//    void uchit() {
//        System.out.println("Учить");
//    }
//}
class Teacher extends Employee {
    int kolichestvouchenikov;

    void uchit() {
        System.out.println("Учить");
    }
}

//class Driver {
//    String name;
//    int age;
//    int expirience;
//    String nazvaniemashiny;
//
//    void eat() {
//        System.out.println("Кушать");
//    }
//
//    void sleep() {
//        System.out.println("Спать");
//    }
//
//    void vodit() {
//        System.out.println("Водит");
//    }
//}
class Driver extends Employee {
    String nazvaniemashiny;

    void vodit() {
        System.out.println("Водит");
    }
}
