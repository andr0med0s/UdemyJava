package udemyJava.Lesson.Lesson_16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("privet");
        String s2 = new String("abcdefgabcd");

        String s10 = s2.substring(3);
        System.out.println(s10);
        System.out.println(s2);

        String s11 = s2.substring(3, 7);
        System.out.println(s11);

        String s12 = s2.trim(); // trim создает новый string и убирает пробелы вначале и вконце string-A
        System.out.println(s12);

        String s13  = s2.substring(3, 11);
        System.out.println(s13);

        /*
        *   String s13  = s1.substring(3, 12); // элемента с 12-ым индексом не существует
            System.out.println(s13);
        * */

        String s14 = s1.replace('r' , 'Z');
        System.out.println(s14);
        System.out.println(s1);

        String s15 = s1.replace('o' , 'Z');
        System.out.println(s15);

        String s16 = s1.replace("vet" , "vivka"); // или два stringa или два chara
        System.out.println(s16);

        String s3 = "poka";
        String s4 = s3.replace("k" , "k");
        System.out.println(s3==s4);

        String s5 = "privet, ";
        String s6 = "drug";
        System.out.println(s5.concat(s6));
    }
}
