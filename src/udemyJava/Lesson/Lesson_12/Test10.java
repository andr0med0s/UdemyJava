package Lecture.Lesson_12;

public class Test10 {


    void abc() {
        String str;
        int a = 5;
        if (a >= 10) {
            str = "Privet!";
        }
        if (a < 10) {
            str = "Poka!";
        } else {
            str = null;
        }
        System.out.println(str);
    }


    // void maximum(int i1, int i2, int i3){
    //         if(i1>i2 && i1>i3){
    //             int a = 5;
    //             System.out.println("Maximum - " + i1);
    //         }
    //         else if(i2>i1 && i2>i3){
    //             int a = 10;
    //             System.out.println("Maximum - " + i2);
    //         }
    //         else {
    //             int a = 15;
    //             System.out.println("Maximum - " + i3);
    //         }
    // }

    public static void main(String[] args) {

        int a = 20;
        int b = 20;

        int maximum = (a > b) ? a : b; // a операнда когда true, b операнда когда false
        System.out.println(maximum);


        // Test10 t = new Test10();
        // t.maximum(4, 7, 0);


        // int salary = 1500;
        // boolean b=true;

        // if (salary < 200) {
        //     System.out.println("ZP ochen nizka");
        // } else if (salary < 400 && b==false || true) {
        //     System.out.println("ZP srednego razmera");
        // } else if (b==true) {
        //     System.out.println("ZP vysokaja");
        //  } //else {
        //     System.out.println("ZP otlichnaja");
        // }
        // if (salary >= 500) { // если в скобках выражение true, то выполняется тело
        // стейтмента (в фигурны скобках)(выполняется блок if)
        // System.out.println(":-)");
        // } else
        // System.out.println(":-(");
        // System.out.println("Все будет хорошо");
    }
}
