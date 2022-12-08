package Lecture.Lesson_15;

public class Test9 {
    public static void main(String[] args) {
        int chas = -1;

        OUTER:
        do {
            chas++; // обращать внимание где стоит апдейт стейтмент
            int minuta = 0;


            INNER:
            while (minuta < 60) {

                if (minuta == 20) {
                    // continue OUTER; //  заканчивай с итерейшеном и переходи к outer loop
                    break OUTER;
                }

                System.out.println(chas + ":" + minuta);
                minuta++;
            }
            // chas++;// обращать внимание где стоит апдейт стейтмент
        }
        while (chas < 24);
    }
}
//  инициализация переменных вне тела лупов\циклов chas\minuta