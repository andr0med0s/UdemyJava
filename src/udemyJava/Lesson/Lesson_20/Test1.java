package udemyJava.Lesson.Lesson_20;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("privet");                  // 1
        Car c = new Car();
        list.add(c);                         // 2
        Student s = new Student();
        list.add(s);                         // 3
        list.add(new StringBuilder("ok"));   // 4

        // в ArrayList Добавлены 4-ре объекта с разными типами данных
        // В основе ArrayList лежит массив типа данных object , поэтому можно добавить любой тип

        ArrayList <String> list2 = new ArrayList(30); // запись равнозначна
                                                                // ArrayList <String> list2 = new ArrayList<String>();
                                                                 // в параметре задана начальна возможная емкость в
                                                                // кол-ве 30 и тип должен быть int
        ArrayList <String> list5 = new ArrayList<>(list2);
        System.out.println(list2 == list5);

        list2.add("poka");
        // list2.add(s); <<< нельзя добавить потому что указан тип String

        ArrayList <StringBuilder> list3 = new ArrayList <> (); // !!!! НО такая запись предпочтительно

        // List <StringBuilder> list3 = new ArrayList();
        // list3.add(list.add(new StringBuilder("ok"));
    }
}

class Car {}
class Student {}

// синтаксис выглядит : ArrayList <DataType> list1 = new Arraylist <DataType> ();