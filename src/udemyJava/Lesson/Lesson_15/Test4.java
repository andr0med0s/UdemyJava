package Lecture.Lesson_15;

public class Test4 {
    public static void main(String[] args) {

        int a = 5; //  это при ++a ... 6, 7, 8, 9, 10
        // это при a++ ....6,7,8,9,10,11 и вывод 12

        while (a++ < 10) {
            a++;
        }
        System.out.println(a);
    }

}
