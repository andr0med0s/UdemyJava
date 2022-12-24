package udemyJava.Lesson.Lesson_23;

public class Test5 {
//   final Test5(){} // конструктор нельзя сделать final
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        Teacher1 t = new Teacher1();
        //  emp.sleep(); есть у Employee1, но его нет у Teacher1 ... нельзя вызвать
        //t.sleep(); // метод отработает если public
//        Employee1 e = new Teacher1();
//        //    e.sleep(); //не наследуется классом Teacher1
//        Employee1 e = new Teacher1();
//        e.sleep(); // static void sleep() {System.out.println("Спит учитель");} этот метод hiding
        System.out.println(t.salary);
    }
}

class Eda {
}

class Frukti extends Eda {
}

class Employee1 {
    double salary = 100;
    String name = "Kolz";

    final public Eda eat() {
        System.out.println("Кушает работник");
        Eda e = new Eda();
        return e;
    }

//    private void sleep() {   //
//        System.out.println("Спит работник");
//    }

    //    static void sleep() {   //
//        System.out.println("Спит работник");
//    }
    final static void sleep() {   //
        System.out.println("Спит работник");
    }
}

class Teacher1 extends Employee1 {

    //    double salary = 200;
    String salary = " двести ";

//    @Override
//    public Eda eat() {
//        System.out.println("Кушает учитель");
//        Frukti f = new Frukti();
//        return f;
//    }

    int kolichestvouchenikov;

    void uchit() {
        System.out.println("Учить");
    }

    //    public void sleep() {                       //это новый метод он не относится к методу из супер класса
//        System.out.println("Спит учитель");
//    }
    //  @Override
//    static void sleep() {
//        System.out.println("Спит учитель");
//    }
}

//final class T {}
//
//class P extends T{}