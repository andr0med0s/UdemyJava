package udemyJava.Lesson.Lesson_20;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList <String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);

     //   Iterator <String> it = list1.iterator();
       // while(it.hasNext()) {
         //   System.out.println(it.next());
        //}

        ListIterator<String> it = list1.listIterator();
        while(it.hasNext()) { // есть последующий элемент
            //System.out.println(it.next());
            it.next(); // выдает следующий элемент
            it.remove();// этот метод его удаляет
        }

/*
        ArrayList <String> list2 = list1;
        ArrayList <String> list3 = new ArrayList<>();
        // ArrayList <String> list4 = new ArrayList<>();
        //list4.add(s3);
        //  list3.add(s3);

        list3.add(s1);
        list3.add(s4);
        // важен порядок добавления
        list3.add(s2);
        list3.add(s3);
       // System.out.println(list1.equals(list2)); // true
      //  System.out.println(list1.equals(list3)); // true
        //  System.out.println(list1.equals(list4)); // false
        System.out.println(list1.equals(list3)); // false порядок важен
        // два ArrayList считаются равными если они содержат одинаковые элементы

    //    System.out.println(list1);
   //     Collections.sort(list1);
     //   System.out.println(list1);

 */


    }
}
