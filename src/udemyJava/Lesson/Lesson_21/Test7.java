package udemyJava.Lesson.Lesson_21;

public class Test7 {
    int a = 5;
//    int l; //вне метода так нельзя
//    l = 4;//вне метода так нельзя
    int t, h=5,k;


//    public  void abc(int a, double b) {
//        System.out.println("privet");
//    }
//    public  void abc( double b, int a) {
//        System.out.println("poka");
//    }

//*    public  void abc(int a, int b) {
// *       System.out.println("privet");
//  *  }
    public  void abc( double a, double b) {
        int c; // внутри метода так сделать можно
        c = 10; // внутри метода так сделать можно
        System.out.println("poka");
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
      //  t.abc(1,2);
        t.abc(1,2);
    }
}
