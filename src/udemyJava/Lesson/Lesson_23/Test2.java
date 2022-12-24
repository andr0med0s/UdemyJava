package udemyJava.Lesson.Lesson_23;

public class Test2 {

//    public Object abc (){return new String("dsffdw");}
//    public Object abc (){return new StringBuilder("dsffdw");}
//    public Object abc (){return new Doctor();}
//    public Object abc (){return new int []{2,7,4,0};}


    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Driver dr = new Driver();
//        Employee e = new Employee();

        Employee emp1 = new Doctor(); // ссылочная переменная emp1 типа Employee может ссылаться на объект типа доктор
                                        // <--- с права на лево Doctor это Employee
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.expirience);
        emp1.eat();
        emp1.sleep();
//        emp1.lechit(); e переменной типа Employee нет метода lechit()

        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
//  повторение      System.out.println(emp2.a); переменная a private

      //  Driver dr2 = new Employee(); // <---- неверно Employee может быть и Doctor и Teacher и...
        // Переменная суперкласса может ссылаться на объект субкласса!!!

//        Xirurg x = new Xirurg();
        Doctor d2 = new Xirurg();
        System.out.println(d2.age);
        System.out.println(d2.name);
        System.out.println(d2.salary);
        System.out.println(d2.expirience);
        System.out.println(d2.expirience);
//        System.out.println(d2.skalpel); //У класса Doctor этого нет
//        d2.operaciya(); //У класса Doctor этого нет
        d2.eat();
        d2.sleep();
        d2.lechit();


        Employee emp4 = new Xirurg();
        emp4.eat();
        emp4.sleep();
        System.out.println(emp4.expirience); // и т.д
//        System.out.println(emp4.skalpel); не представляется возможным
//        emp4.operaciy(); не представляется возможным
    }
}

class Employee  {                                  //общие элементы для всех субклассов
    double salary = 100;
    String name = "Kolz";
    int age;
    int expirience;
//повторение   private int a = 5; // видна только в классе Employee

    void eat() {
        System.out.println("Кушать");
    }

    void sleep() {
        System.out.println("Спать");
    }
}

class Doctor extends Employee {

    void lechit() {
        System.out.println("Лечить");
    } // методы присущие субклассу

}

class Xirurg extends Doctor {
    String skalpel;
    void operaciya(){}
}

class Teacher extends Employee {
    int kolichestvouchenikov;

    void uchit() {
        System.out.println("Учить");
    }// методы присущие субклассу
}

class Driver extends Employee {
    String nazvaniemashiny;

    void vodit() {
        System.out.println("Водит");
    }// методы присущие субклассу
}
