package udemyJava.Lesson.Lesson_19;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
/*
*         for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
* */
        for (int a : array) { // тип имя переменной   :  имя массива
            // сначала int a = 0 и поочереди принимает все значения из массива array
            System.out.print(a + " ");
        }
    }
}
