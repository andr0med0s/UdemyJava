package udemyJava.Lesson.Lesson_25;

public class Test3 {
    public static void main(String[] args) {
//        Employee emp1 = new Doctor();
//        Help_able h = new Doctor();
//        Employee emp = new Doctor();
        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher(); // автоматический casting //upcasting
        Employee emp3 = new Driver();
        Employee emp4 = new Employee();
        Employee [] array = {emp1, emp2, emp3, emp4};

        for (Employee e:array) {
            if(e instanceof Driver ){
             //   System.out.println(e.nazvanieMashin);//нужно сделать cast
                System.out.println(((Driver) e).nazvanieMashin);
                ((Driver) e).vodit();
            }
        }

//        Employee e = new Employee();
//
//        //   Doctor d1 = (Doctor)emp1; //casting// переменная emp1 замаркирована под переменную d1
////        System.out.println(emp1.specializatcia);
//        //    System.out.println(d1.specializatcia);
//        //   d1.lechit();
//        //System.out.println(((Test3)emp1).specializatcia); нет взаимоотношения is-a
//        h.help();
//        Test3 t = new Test3();
////        System.out.println(((Doctor)emp1).specializatcia);
////        ((Doctor)emp1).lechit();
//       /*
//        System.out.println(((Doctor)h).specializatcia);
////        h.lechit();
//        ((Doctor)h).lechit(); //class и interface находятся во взаимоотношениях is-a
//
//        */
//        //  Driver d = (Driver)emp2; Exception in thread "main" java.lang.ClassCastException
//
//        ((Doctor) emp).help(); // кастинг сам тип переменной не меняет
//        // кастинг маркирует переменную emp под тип Doctor
//
//        System.out.println(e == emp);
//        System.out.println(e == emp2);
//        System.out.println(h == emp);
//        //System.out.println(e == t); e и t не могут ссылаться на один и тот же объект
//        //между Employee и Test3 нет связи IS A
//        System.out.println(e.equals(t)); // метод equals можно использовать с любыми объектами, потому что его можно overriding

    }
}

class Employee extends java.lang.Object {
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

class Doctor extends Employee implements Help_able {
    String specializatcia = "хирург";

    @Override
    public void help() {
        System.out.println("Doctor okazivaet pomosh");
    }

    void lechit() {
        System.out.println("Лечить");
    }
}

class Teacher extends Employee {
    int kolichestvouchenikov;

    void uchit() {
        System.out.println("Учить");
    }
}

class Driver extends Employee {
//    String nazvanieMashiny;
    String nazvanieMashin = "Mercedes";

    void vodit() {
        System.out.println("Водит");
    }
}

interface Help_able {
    void help();
}