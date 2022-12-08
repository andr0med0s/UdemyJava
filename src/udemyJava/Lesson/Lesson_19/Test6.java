package udemyJava.Lesson.Lesson_19;

public class Test6 {
    public static void main(String[] args) {
        int[][] array = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}};
/** traditional loop
 *         for(int i = 0; i < array.length; i++){ // цикл для одного массива
 for(int j = 0; j < array[i].length; j++){ // inner loop цикл для "вложенного" второго   массива
 System.out.print(array[i][j] + " ");
 // то есть внешний цикл входит в {3, 7, 8} (первый одномерный массив) и  вложенный цикл входит в разбивку и проходит по элементам 3, 7, 8
 // далее вход во второй одномерный массив и проход по элементам
 // далее вход в третий одномерный массив и проход уже по его элементам
 }
 }
 * */

//---------nested foreach loop---------
        for (int[] array2 : array) { // -- элементом двумерного массива является одномерный массив array2
            for(int a : array2 ) {
                System.out.print(a + " ");
            }
        }
    }
}
