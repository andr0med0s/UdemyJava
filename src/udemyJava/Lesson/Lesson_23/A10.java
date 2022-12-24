package udemyJava.Lesson.Lesson_23;

public class A10 {
    String s1 = "privet";
    //    private String s1 = "privet";
    static double d1 = 3.14;

    int summa(int... i) {
        int result = 0;
        for (int a : i) {
            result += a;
        }
        return result;
    }

    static void abc() {
        System.out.println("static method");
    }
}

class B10 extends A10 {
    //    String s2 = super.s1 + " ,drug";
//    String s1 = super.s1 + " ,drug";
//    boolean s1 = true;
    //static String s1 = super.s1; статической переменной нельзя назначить переменнуюкоторая связана с созданием объекта
    String s1 = super.s1;
    double d1 = super.d1;  // с помощь. объекта можно обратиться к статической переменной

    int summa(int... i) {
//        int result = 0;
//        for (int a : i) {
//            result += a;
//        }
        //  int result = super.summa(i);
        int result = 0;
        System.out.println("Summa: " + result);
//        int result = super.summa(i); // не обязательно быть на первом месте в теле метода
        result = super.summa(i); // не обязательно быть на первом месте в теле метода
        super.abc();
        return result;
    }

    public static void main(String[] args) {
        B10 b = new B10();
//        System.out.println(b.s2);
        System.out.println(b.s1);
//            System.out.println(super.s1);
    }
}