package udemyJava.Lesson.Lesson_25;

public class Test6 {
    public static void main(String[] args) {
//        byte b = 10;
//        int a=b;
//        System.out.println(7);
//
////        int i1 = 3; // i1 не константа
////        final int i1 = 3; // не константа
////        short s2 = i1;
//
//        int i1 = 3;
//        short s2 = (short) i1;
//
//        byte b2 = 3;
//        short s1 = -6;
//        char c1 = 100;
//
////        long l1 = 1;
//        final long l1 = 1;
////        int i2 = l1; // ошибка компиляции
//        int i2 = (int) l1; // можно при использовании casting-a
//
//        int i10=111111;
//        short s10=(short)i10;
//        System.out.println(s10); // потеря информации
//
//        char c10 = (char) - 8;
//        System.out.println(c10);
//        boolean b10 = true;
//        //int i11 = (int)b10; // невозможно true закастить в int
//        int i12 = (int)3.14;
//        System.out.println(i12); // вывод на экран 3
//        double d = 5487879456.54623;
//        byte b12 = (byte)d;
//        System.out.println(b12); // на экран не выведется 5487879456.54623

//        int i = 2147483647;
//        System.out.println(i + 1);

        int i = 5;
        long l = 10;
//        i = i * l; так нельзя
        i = (int)(i * l); // так можно
        i *= l;//это тоже что и  i = (int)(i * l);  так можно
        System.out.println(i + l); //i кастится в long, а потом происходит сложение

        float f = 3.14f;
        int i2 = 10;
        System.out.println(f+i2);

        byte b = 3;
        short s = 4;
        char c = 5;
        System.out.println(b+s+c);
        System.out.println(b++);

        byte b2 = 10;
        float f2 = 7;
        double d2 = 2.0;
        System.out.println(b2+f2-d2);
//        double i5 = b2+f2-d2;

        double d10 = 3.14;
        float f10 = 6.28f;
    }
}
