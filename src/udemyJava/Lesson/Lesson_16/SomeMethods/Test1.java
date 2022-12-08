package udemyJava.Lesson.Lesson_16.SomeMethods;
//isBlank
//isEmpty
//strip, stripLeading, stripTrailing
public class Test1 {
    public static void main(String[] args) {
        /*   String s1 = "privet";
        System.out.println(s1.isBlank()); // true если есть симвоолы пробел, таб ... пустое пространство...
        String s2 = "     ";
        System.out.println(s2.isBlank());

        String s3 = "";
        System.out.println(s3.isEmpty() );
         */

        String s4 = "    privet        ";
       // System.out.println(s4.stripTrailing() );
        String s5 = "poka";
        String s6 = s5.strip();
        System.out.println(s5 == s6); //s5 и s6 ссылаются на один и тотже объект
    }
}
