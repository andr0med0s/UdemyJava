package udemyJava.Lesson.Lesson_20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("poka"));
        list.add(new String("privet"));
        list.add(new String("ok"));
        list.add(new String("poka"));
        list.add(new String("hello"));
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println(list.indexOf(new String("poka"))); // на экран выводится индекс первого совпадения
        System.out.println(list.lastIndexOf(new String("poka"))); // последний индекс совпадения
        System.out.println();
        System.out.println(list.size()); // выводится количество элементов в ArrayList
      //  list.clear();
      //  System.out.println(list.isEmpty()); // false ArrayList не пустой, если сделать clear то будет true
        System.out.println(list.contains("poka")); // выведет true, так как объект содержится в ArrayList
        System.out.println(list.toString());  // работает для любого объекта
    }
}
