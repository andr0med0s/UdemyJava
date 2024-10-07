package udemyJava.Lesson.Lesson_26;

public class Test6 {
    int a = 3; // сначала a принимает значение 3

    Test6() {
        a = 4; // и в завершении меняет значение в конструкторе
    }

    {
        a = 5; // потом a меняет значение в init block-е
    }

//    public static void main(String[] args) {
//        Test6 t = new Test6();
//        System.out.println(t.a);
//    }
}

class A {
    static final int b;
    int a = 5;

    static {
        b = 10;
    } // статическую переменную можно определить внутри static initializer block
    // потому что static переменная определяется при загрузке класса
    // static {b=10, int a;} // к int a нет доступа, она не определена, она определяется,
    // когда создается объект класса
}

class B {
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;

    static {
        //c=5; // с не является константой поэтому можно не определять в static init block-е
        d = 3;
        //e=2; // e константа уже определена, не может принимать значение
        f = 0;
    }
}

class C {
    String s = "ok";

    {
        System.out.println(s);
    } // 3

    static int i = 0; // 1

    static {
        System.out.println(i);
    }          // 2

    static {
        i = i + 1;
        System.out.println(i);
    }   // 2

    C() {
        System.out.println("eto konstruktor");
    } // 4

    public static void main(String[] args) {
        C с = new C();
    }
}

class D {
    static {
        abc(2); // 1
    }

    static void abc(int a) {
        System.out.println(a + " ");
    }

    D() {
        abc(5); // 5
    }

    static {
        abc(4); // 2
    }

    {
        abc(6); // 3
    }

    static {
        new D();
    }

    {
        abc(8);  // 4
    }

    public static void main(String[] args) {

    }
}
