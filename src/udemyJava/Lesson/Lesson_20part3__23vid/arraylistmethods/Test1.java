package udemyJava.Lesson.Lesson_20part3__23vid.arraylistmethods;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    /*

    public static void main(String[] args) {
        ArrayList <String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("al1 = " + al1 );

//        ArrayList <String> al2 = new ArrayList<>();
//        al2.add("one");
//        al2.add("three");
//        al2.add("four");
//        al2.add("ten");

//        al1.removeAll(al2);
//        System.out.println("al1 = " + al1 );

//        al1.retainAll(al2);
//        System.out.println("al1 = " + al1 );
//        boolean result = al1.containsAll(al2); // содержит ли al1 все элементы al2
//        System.out.println("result = " + result);

//        List <String> sublist = al1.subList(1,4); // это не отдельная сущьность , а представление..View...
//        System.out.println("Отрывок = " + sublist);
//        sublist.add("ten");
//        System.out.println("al1 = " + al1);
//        System.out.println("sublist = " + sublist);
//        al1.add("million");
//        System.out.println("al1 = " + al1);
//        System.out.println("sublist = " + sublist); // вызывает ошибку потому что все структурные модификации
//        // в данном случае должны быть сделаны с помощью View / представления
        Object [] array = al1.toArray();
        String [] array2 = al1.toArray(new String[15]);
        for (String s : array2){
            System.out.println(s);
        }
    }

     */

    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        // System.out.println("al1 = " + al1);

        List<String> list = List.of("odin", "dva", "tri");   // эти методы статичные поэтому используем
                                                                // сам интерфейс List в его названии
//        List<String> list = List.of("odin", "dva", null); // эти листы не могут содержать элементы null
        System.out.println("list = " + list);
    //    list.add("dasw"); // этот лист невозможно модифицировать

        List<String> list2 = List.copyOf(al1);
        System.out.println("list2 = " + list2 );
    }
}
