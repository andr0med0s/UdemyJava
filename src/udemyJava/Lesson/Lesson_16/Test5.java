package udemyJava.Lesson.Lesson_16;

public class Test5 {
    public static void main(String[] args) {
        String s = null; // ни на что не ссылается
        s+= "ok";
        System.out.println(s);
        //System.out.println(null + true); // ---- ошибка конкатенации
    }
}
