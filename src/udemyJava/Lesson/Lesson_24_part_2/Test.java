package udemyJava.Lesson.Lesson_24_part_2;

public class Test {

}

interface I1 {
    private static void method1() {
        System.out.println("static method1");
    }

//    void method2() ;

    private void method2() { //если private то обязаны написать тело
        System.out.println("non-static method");
    }

//    abstract void method2();

    default void method3() {
        method2();
        method1();
    }

    static void method4(){
       // method2(); private метод внутри static вызвать нельзя
        method1();
    }

}
