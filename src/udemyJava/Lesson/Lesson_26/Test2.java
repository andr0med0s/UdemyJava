package udemyJava.Lesson.Lesson_26;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5); // автобоксинг - автоматический процесс конвертирования
                    // примитивного типа данных в референс тип данных
       //  Long l = 50l; // конвертируется 50 как тип данныз лонг
        // Long l = 50; // int конвертировать в long нельзя
        int a = list.get(0); // unboxing
        System.out.println(a);
//        Integer b = new Integer(10);
        Number b = new Integer(10); //Number родительский класс для численных wrapper классов
//        int c = b;
        int c = (int) b; // здесь происходит процесс unboxing
        switch(c){} // в switch можно использовать wrapper классы

        String s1 ="50";
//        String s1 =" 50"; с пробелом будет ошибка, парсится не то значение которое может быть int-ом
//        String s2 = "true"; // только написание true
        String s2 = "asadetrue"; // будет false
        String s3 = "3.14";
        int i1 = Integer.parseInt(s1);
//        boolean b1 = Boolean.parseBoolean(s2);
        Boolean b1 = Boolean.parseBoolean(s2);
        double d = Double.parseDouble(s3);
//        System.out.println(i1);
//        System.out.println(b1);
                                        // метод valueOf может вмещать несколько типов параметров, то
                                        // есть существует несколько overloaded методов valueOf
        Integer i3 = Integer.valueOf(10);  // здесь поместили int
        Double d2 = Double.valueOf(s3);  // здесь поместили подходящий string, что бы double мог содержать это значение
//        Byte b10 = new Byte(5); // 5 - это int , а внутри должно быть byte
        Byte b10 = new Byte((byte)5); // нужно сделать кастинг
        Integer i6 = new Integer(6);
//        System.out.println(d);
//        System.out.println(i3);
//        System.out.println(d2);
//        System.out.println(b10==i6); //нельзя писать компилятор не разрешает, ошибка! неравны, сравниваются разные типы
          System.out.println(b10.equals(d2)); // можно написать но всегда будет false
    }
}
