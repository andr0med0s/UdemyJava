package udemyJava;

public class Summation {

    int sum() {
        int result = 0;
        System.out.println("Sum of all numbers: " + result);
        return result;
    }

    int sum(int a) {
        int result1 = a;
        System.out.println("Sum of all numbers: " + result1);
        return result1;
    }

    int sum(int b, int c) {
        int result2 = b + c;
        System.out.println("Sum of all numbers: " + result2);
        return result2;
    }

    int sum(int d, int e, int f) {
        int result3 = d + e + f;
        System.out.println("Sum of all numbers: " + result3);
        return result3;
    }

    int sum(int g, int h, int j, int k) {
        int result4 = g + h + j + k;
        System.out.println("Sum of all numbers: " + result4);
        return result4;
    }
}

class SummationTest {
    public static void main(String args[]) {
        Summation rez = new Summation();

        rez.sum();
        int a = 10;
        rez.sum(a);
        // int b = 20;
        // int с = 30;
        rez.sum(20, 30);
        rez.sum(40, 50, 60);
        rez.sum(70, 80, 90, 100);

    }
}