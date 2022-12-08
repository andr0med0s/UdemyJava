package udemyJava.Homework.Lesson_18;

public class Exercise1 {
    public static int[] sortirovka(int[] array) {
        // в параметры принимает массив типа int и возвращает массив типа int
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5,8,1,-3,0,8,2,2}; // заполнили созданный массив элементами
        sortirovka(array); // вызвали созданный массив
        for (int i = 0; i < array.length; i++) { // с помощью цикла for выводим в консоль отсортированный массив
            System.out.println(array[i]);
        }
    }
}
