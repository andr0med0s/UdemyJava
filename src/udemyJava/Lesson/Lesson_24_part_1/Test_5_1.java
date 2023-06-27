package udemyJava.Lesson.Lesson_24_part_1;

public class Test_5_1 {
}

interface I2 {
    default void abc() { // в данном случае могли не оверрайдить или класс должен стать abstract
        System.out.println("eto metod abc");
    }

    static void def() {
        System.out.println("static method 1");
    }
}

interface I3 {
    static void def() {
        System.out.println("static method 2");
    }
}

/*
interface I3 extends I2 {
    //    default void abc() {
//        System.out.println("eto metod abc!!!!");
//    }
    void abc(); //класс который будет имплементировать I3 уже должны оверрайдить abc
}
*/
/*
abstract class R implements I2{
//     public void abc() {
//        System.out.println("eto metod abc");
//    }
    abstract public void abc();
}
*/
/*
abstract class R implements I2,I3{
    public static void main(String[] args) {
       // R.def(); //так вызвать нельзя. статический метод не наследуется
        //обратится к этому методу можно только с помощью названия interfac-a
        I2.def();
        I3.def();
    }

}
*/

abstract class O {
}

class R extends O implements I2 {
    //void method(){}
//    R method1() {return new R();}
//    O method1() {return new R();}
//    I2 method1() {return new R();}
    static I3 method1(I3 i) {
        return new D2();
    }

    public static void main(String[] args) {
        I3 i = new D2();
        method1(i);
    }

}

class D2 implements I3 {
}

//class Z2 implements I1{
//   public void abc(){
//       System.out.println("eto metod abc");
//   }
//
//    public static void main(String[] args) {
//        Z2 z = new Z2();
//        z.abc();
//        z.def();
//        z.ghi();
//    }
//   // default void ghi(){ System.out.println("eto metod ghi");} // внутри класса нельзя написать default
//    public void ghi(){ System.out.println("eto metod ghi");} // должны использовать public
//}