package udemyJava.Lesson.Lesson_19;

public class Test2 {

    //static void summa(String s , int... a, String s2) { varargs должен стоять на последнем месте и нельзя использовать дважды
    // ---- если необходимо использовать String s2 в конце записи,
    // то вместо int... a ( varargs )  используют массив int[] a
    // потому что массив может находится где угодно в списке параметров
    static void summa(String s, int... a) { //int...a [int-тип данных]...[a - имя переменной]это и есть varargs и означает что метод
                                            // summa можно вызвать с любым количеством параметров типа int
        // summa это метод для сложения параметров
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
        System.out.println(s);
    }

    public void abc(int[] ...array){}// таким образом в параметре varargs можно использовать массив (любое количество массивов типа int )

    public static void main(String[] args) {
        //summa("ok",6,9,3);
        summa("ok",new int[]{1, 2,3}); // --- varargs в java представляется как массив
        // summa("ok",null); так как массив это объект то запись корректна, но выпадет NullPointerException
          //-- так как for (int i = 0; i < a.length; i++) {   --   a.length   ссылается на Null
    }

    /*
    *     static void summa(int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
    }

    public static void main(String[] args) {
        summa(6,9,3);
    }
    * */

  /*
    static void summa(int a, int b) {
        System.out.println(a + b);
    }


*     static void summa(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static void summa(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

* */
    /*
    * public class Test2 {

    static void summa(int[] a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
    }

    public static void main(String[] args) {
        summa(new int []{3,5});
    }
    * */

    /*
    *     * public class Test2 {

    static void summa(int[] a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
    }

    public static void main(String ... args) {
      //  summa(1,2,3); -- нельзя использовать перечисление элементов ,
      *                 // если в методе указан массив int[] a
    }
    * */
}
