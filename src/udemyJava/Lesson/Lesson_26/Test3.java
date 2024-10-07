package udemyJava.Lesson.Lesson_26;

public class Test3 {
//    void abc (int i) { System.out.println("int"); }
    void abc (byte b) { System.out.println("byte"); }
    void abc (long l) { System.out.println("long"); }

    void def(Object o) {System.out.println("Object");}
    void def(String o) {System.out.println("String");}

    //void ghi(int a, int b) {System.out.println("Hello 1");}
    //void ghi(long a, long b) {System.out.println("Hello 2");}
    //void ghi(Integer a, Integer b) {System.out.println("Hello 3");}
    void ghi(int ... a) {System.out.println("Hello 4");}
    public static void main(String[] args) {
        Test3 t = new Test3();
       // t.abc(5); // по умолчанию int, если закоментить sout int, то long так как
                    // конвертируется в тип данных больше себя, иначе нужен кастинг
       // t.def("hello"); // вызывается метод String, это совпадение наиболее близкое
        // t.def(new StringBuilder("hello")); // вызывается object

        //Method overloading, приоритетность методов
        //t.ghi(1, 2); //в первую очередь вызовется метод с параметром int
        //t.ghi(1, 2); // 2 большие типы данных для primitive и parent классы для reference типов (long)
        //t.ghi(1, 2); // Autoboxed типы данных (Integer)
        t.ghi(1, 2); // Varargs самый низкий приоритет
    }
}
