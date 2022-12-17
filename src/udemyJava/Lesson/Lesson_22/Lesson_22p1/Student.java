package udemyJava.Lesson.Lesson_22.Lesson_22p1;

import udemyJava.Lesson.Lesson_22.Human;

public class Student extends Human { // у Human элементы protected и видны только путем наследования
    /*
    public static void main(String[] args) {
        Student s = new Student(); //объект субкласса и его объект можно использовать в другом пакете
//        System.out.println(s.getName());
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();

//        Human h = new Human();  //объект не наследника //объект super class-a
//        System.out.println(h.name);
//        h.work();

        Human h = new Human();
        System.out.println(Human.salary);
        Human.rest();
    }
     */
    public static void main(String[] args) { // здесь эти элементы видны поскольку находятся внутри субкласса
        Student s = new Student();
        System.out.println(s.name);
        s.work();

    }
}

class Test { // класс Test не связан с Human  поэтому мы не можем видеть protected элементы
/*
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        s.work();

        // Если в супер классе есть protected элементы , то в другом пакете они будут видны только в его субклассе
        // и внутри субкласса данные protected элементы унаследованные от супер класса могут быть вызваны
        // только с помощью созданного объекта субкласса. С объектом супер класса данный прием не проходит
    }
 */
}