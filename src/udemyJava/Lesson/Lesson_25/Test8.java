package udemyJava.Lesson.Lesson_25;

public class Test8 {
}

class Test1 implements interface1, interface2{
    public void abc(){
        System.out.println("ok");
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
       // System.out.println(t.a); двусмысленный вызов переменной a
        System.out.println( ((interface1)t).a ); // с помощью кастинга вызывается нужная переменная
                                                // переменная t веди себя как переменная типа interface1
                                                    //у interface1 есть переменная a
//        ( (interface1) t).abc();
         t.abc(); //кастить необязательно runtime определяется t ссылается на объект класса Test1
    }
}
interface interface1{
    int a = 5;
    void abc();
}
interface interface2{
    int a =10;
    void abc();
}