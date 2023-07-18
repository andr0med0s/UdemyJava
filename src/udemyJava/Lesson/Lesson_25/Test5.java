package udemyJava.Lesson.Lesson_25;

public class Test5 {

}


class Test10{
    int a=5;
    void abc(){
        System.out.println("ok1");
    }
}

class Test20 extends Test10{
    int a=10;
    void abc(){
        System.out.println("ok2");
    }
}

class Test30 extends Test20{
    int a=15;
    void abc(){
//        super.abc();
        System.out.println("ok3");
    }

    public static void main(String[] args) {
        Test30 t = new Test30();
        /*
        System.out.println(((Test10)t).a); // воспринимай t переменную как переменную типа test10,
        //а из-за того что переменные compile time binding относится к классу test10 поэтому на экран выводится 5
        */
       ((Test30)t).abc();//run time будет определяться на object-е какого класса вызывается метод abc
        //t ссылается на Test30 будет выведено на экран ok3
        ((Test20)t).abc();//t ссылается на Test30 будет выведено на экран ok3
        ((Test10)t).abc();//t ссылается на Test30 будет выведено на экран ok3
    }
}