package udemyJava.Lesson.Lesson_5;

public class Test20 {

    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int midArif(int a1, int b1, int c1 ) {
      int result2 = summa(a1, b1, c1)/3;
      return result2;
    }

}

class test21 {
    public static void main(String[] args) {
        Test20 t = new Test20();
        int sumThreeNumbers = t.summa(1, 2, 3);
        System.out.println(sumThreeNumbers);
        System.out.println(t.summa(5, 10, 15));

        System.out.println(t.midArif(10,20,30));
    }
}