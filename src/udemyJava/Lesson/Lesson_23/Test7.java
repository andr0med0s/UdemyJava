package udemyJava.Lesson.Lesson_23;

public class Test7 {
    public static void main(String[] args) {
        A1 c1 = new C();
        c1.abc(new B1());
    }
}

class A1{
    void abc(A1 a){
        System.out.println("A");
    }


}

class B1 extends  A1{
    void abc(B1 b1){
        System.out.println("B");
    }
}

class C extends  B1{
    void abc(B1 b2){
        System.out.println("C");
    }
}
