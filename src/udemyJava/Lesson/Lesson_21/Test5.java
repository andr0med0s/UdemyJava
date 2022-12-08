package udemyJava.Lesson.Lesson_21;

public class Test5 {
    void abc(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        char c = 'a';
 //       t.abc(c); // в параметр можно передать не int потому что в основе char лежит int
                        // который определяет порядковый номер символа
        System.out.println('b' + 10); //поэтому можно даже так написать
    }
}
