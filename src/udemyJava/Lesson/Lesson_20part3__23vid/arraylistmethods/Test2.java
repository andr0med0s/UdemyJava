package udemyJava.Lesson.Lesson_20part3__23vid.arraylistmethods;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> al1 = new ArrayList(); // <> указывается для типо безопасности всегда
                                                    // нужно использовать джинерики
        //al1.add(new Test2());
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        for (Object o : al1) {
            System.out.println("Number = " + o + " and length = " + ((String)o).length() );
        }
    }
}
