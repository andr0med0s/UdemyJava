package udemyJava.Lesson.Lesson_23;

public class Test3 {
    public static void main(String[] args) {
//        Employee1 e = new Employee1();
//        Teacher1 t = new Teacher1();
//        e.eat();
//        t.eat();
        Employee1 e = new Teacher1();
        e.eat();
    }
}

//class Eda {
//}
//
//class Frukti extends Eda {
//}
//
//class Employee1 {
//    double salary = 100;
//    String name = "Kolz";
//    int age;
//    int expirience;
//
//
////    void eat() {                               // overrided метод перезаписываемый mетод
////        System.out.println("Кушает работник");
////    }
//
//   public Eda eat() {                                 // если здесь модификатор доступа public
//        System.out.println("Кушает работник");
//        Eda e = new Eda();
//        return e;
//    }
//
////    void eat(int a) {                               // overloaded перегружаемый метод
////        System.out.println("Кушает работник");
////    }
//
//    void sleep() {
//        System.out.println("Спать");
//    }
//}
//
//class Teacher1 extends Employee1 {
//
////    void eat(double b) {
////        System.out.println("Кушает учитель");
////    }
////    void eat() {
////        System.out.println("Кушает учитель");
////    }
//
//    //Eda eat() {
//  public   Frukti eat() {                                  // то и здесь модификатор доступа public
//        System.out.println("Кушает учитель");
////        Eda e =new Eda();
////        return e;
//        Frukti f = new Frukti(); // Frukti это суб класс
//        return f;
//    }
//
//    int kolichestvouchenikov;
//
//    void uchit() {
//        System.out.println("Учить");
//    }// методы присущие субклассу
//}


class A {
    Employee1 objectCreation() { // < ------ перезаписываемые методы
        return new Employee1();
    }
}

class B extends A {
//    Teacher1 ObjectCreation() {
//        System.out.println("ok");
//        return new Teacher1();

        H ObjectCreation () {
            System.out.println("ok");   // субклассы Employee1
            return new H();

            //       Employee1 objectCreation() { // < ------ перезаписываемые методы
            // имена не изменились
            // возвращаемый тип не изменился
            //список параметров так же без изменений
            //           return new Employee1();
            //      }
        }
    }

    class H extends Teacher1 {     // // субклассы Employee1
    }