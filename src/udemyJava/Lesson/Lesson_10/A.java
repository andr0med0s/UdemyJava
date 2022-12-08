
package udemyJava.Lesson.Lesson_10;

import static  udemyJava.Lesson.Lesson_9.Car.*;
// import Lecture.Lesson4.Student; нету здесь этого пакета....
// import Lecture.Lesson9.*;
// import java.lang.*; --- дефолтный импорт ,  в любой созданный класс

public class A {

    static int count = 99;

    public static void main(String[] args) {
        System.out.println(ab);
        System.out.println(count); // выводится count не из пакета Lecture.Lesson9.Car , а из класса class A !!
    }


    // Student st1 = new Student();


}


//     public static void main(String[] args) {

//         // java.lang.String st1 = new java.lang.String("Hello");
//         String st1 = new String("Hello");

//         Student st2 = new Student();
//         System.out.println(st2.z);
//         System.out.println(Student.c); // использование статичной переменной в другом классе
//     }
// }

// class B {
//     Student st3 = new Student();
// }