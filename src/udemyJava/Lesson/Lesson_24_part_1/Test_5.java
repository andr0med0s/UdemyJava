package udemyJava.Lesson.Lesson_24_part_1;

public class Test_5 {
}

interface I1{
    void abc();
   public default void ghi(){ // если метод неоверрайдится/неперезаписывается то указывается public
                                //в противном случае компилятор сам ставит public
                            // default здесь это не access modificator, а говорит о том что
                              // есть дефолтная реализация, есть дефолтное тело
        System.out.println("eto metod ghi");
    }
    default void def(){
        System.out.println("eto metod def"); //в отличие от abstract default имеет тело и его можно не перезаписывать
                                             // можно не overriding
    }
}

class Z2 implements I1{
   public void abc(){
       System.out.println("eto metod abc");
   }

    public static void main(String[] args) {
        Z2 z = new Z2();
        z.abc();
        z.def();
        z.ghi();
    }
   // default void ghi(){ System.out.println("eto metod ghi");} // внутри класса нельзя написать default
    public void ghi(){ System.out.println("eto metod ghi");} // должны использовать public
}