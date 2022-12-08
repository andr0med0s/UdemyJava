package udemyJava.Lesson.Lesson_21;

public class Test1 {
    public static void main(String[] args) {
        // int a = 4;
        //  int a = 3;
        //  System.out.println(a < 4 ? 7 : "privet"); // если a<4 true то вывести 7, если fasle то "привет"
        // int b = (a < 4) ? 7 : "privet" ; так писать нельзя если (a<4) false , то int b присвоить "privet" нельзя

        int a = 5;
        int b = 5;
        int c = (a < 6) ? a++ : b++;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}