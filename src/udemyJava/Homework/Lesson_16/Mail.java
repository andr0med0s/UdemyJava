package udemyJava.Homework.Lesson_16;

public class Mail {

    public void email (String s) {
        int a = 0;// позиция символа @
        int b = 0;// позиция символа .
        int c = 0;// позиция символа ;
        while (c < s.length()-1) { // значение индекса меньше на 1 его длины, так как отсчет начинается с нуля
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c +  1);
            System.out.println(s.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        Mail l16 = new Mail();
        l16.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
