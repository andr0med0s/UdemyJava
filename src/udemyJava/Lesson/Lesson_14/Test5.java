package Lecture.Lesson_14;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 87) {
                continue; // на выводе на экран пропустится 87
                // break;
            }
            if (i % 55 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
// continue заканчивает текушую итерацию