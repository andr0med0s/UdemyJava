package udemyJava.Lesson.Lesson_18;

public class Test3 {
    static String s;
    public static void main(String[] args) {
        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
       // array[3] = 5; // выход за границы массива

        int [][] array2 = new int[3][];
    //    System.out.println(array2[][1]); // NullPointerException , Объект без содержимого null , не определлен
        System.out.println(s.length()); // NullPointerException , длина ничто , null

    }
}
