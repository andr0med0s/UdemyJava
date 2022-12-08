package udemyJava.Lesson.Lesson_21;

public class Test3 {
    /*
            //    Test3(){ // это конструктор
        //        System.out.println("Sozdalsya obyekt");
        //    }
            void Test3() { // это не конструктор, у конструктора нет возвращаемого типа
                System.out.println("Sozdalsya obyekt");
            }
     */


    Test3(){
        System.out.println("eto конструктор");
    }
    void Test3(){
        System.out.println("eto метод");
    }

//    int Test3 = 5;
    Test3 Test3; // на первом месте тип Test3(может быть Test3 потому что класс Test3) на втором месте переменная Test3
}

class A {
    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}
