package udemyJava.Lesson.Lesson_19;

public class Test5 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"mat analiz", "filosophiya"};
        for (String s1 : students) { // переменная s1 будет поочереди принимать значения из массива students
            for (String s2 : exams) {// переменная s2 будет поочереди принимать значения из массива exams
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
