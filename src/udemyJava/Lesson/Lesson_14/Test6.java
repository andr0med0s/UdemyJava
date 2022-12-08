package Lecture.Lesson_14;

public class Test6 {
    public void time() {
        OUTER:
        for (int chas = 0; chas <= 23; chas++) {
            System.out.println("Начало outer loops ");

            INNER:
            for (int minuta = 0; minuta <= 59; minuta++) {

                if (minuta == 20) {
                    continue OUTER;
                }

                if (minuta == 30) {
                    break;
                }

                System.out.println(chas + ":" + minuta);

            }
            System.out.println("Конец outer loops ");
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }
}
