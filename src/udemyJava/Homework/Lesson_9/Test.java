package Homework.Lesson_10;

//  class Test {
//     int a=1;
//     static int a=2;
//     void abc(int a){
//         System.out.println(a);
//         System.out.println(this.a);
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.abc(3);
//     }
// }

// class Test {
//     int a=1;
//     static int b=2;
//     static void abc(final int a){
//         System.out.println(a);
//         System.out.println(Test.b);
//     }
//     public static void main(String[] args) {
//         abc(5);
//     }
// }

class Test {
    int a = 1;
    static int b = 2;

    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test.b);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.abc(4);
    }
}