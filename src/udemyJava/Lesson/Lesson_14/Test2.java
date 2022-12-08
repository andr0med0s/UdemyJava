package Lecture.Lesson_14;

public class Test2 {
    public static void main(String[] args) {

        for (int i = 5; i < 11; i++) { // без указания update statementa (счетчика итераций) получим бесконечный цикл
            System.out.println(i);
            abc(10);

            // for(int i=1, j=2, k=10; i<11;i++, j++) {
            // без указания condition statementa i<11 принимается значение true получим бесконечный цикл
            // System.out.println(i+j);

        }
    }

    static void abc(int n) {
        System.out.println(n);
    }
}
