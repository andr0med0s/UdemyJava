package udemyJava.Lesson.Lesson_26;

public class Test5 {
    /*
    String s1;
    {
        s1 = "ok";
        System.out.println("Hello");  // это initializer block
        int a = 5;
        System.out.println(a);
    }
*/

    {
        System.out.println("Eto init block 3");
    }

    Test5(){
        System.out.println("Eto konstruktor 1");
    }

    Test5(int a){
        this();
        System.out.println("Eto konstruktor 2");
    }
    {
        System.out.println("Eto init block 1"); // вызывается сразу после супер конструктора
    }

    static {
        System.out.println("Eto STATIC init block 1"); // вызываются самыми первыми и один раз
    }

    {
        System.out.println("Eto init block 2"); // вызывается по порядку написания
    }

    static {
        System.out.println("Eto STATIC init block 2"); // по порядку написания
    }
    public static void main(String[] args) {
        Test5 t1 = new Test5();
//        Test5 t2 = new Test5();
        Test5 t2 = new Test5(3);
    }
}
