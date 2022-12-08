package udemyJava.Homework.Lesson_18;

public class Exercise2 {

    public static void showArray(String[][] array) {// метод showArray в параметре которого двумерный массив
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) { // array.length длина двумерного массива
                                                    // (сколько содержит одномерных массивов)
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) { //array[i].le
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length - 1) {
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
        }
        System.out.print(" }");
    }

    public static void main(String[] args) {
        String array [][] = {{"apple", "orange"}, {"hello", "bye", "ok"},{"car"}};
        showArray(array);
        showArray(new String[][] {{"man", "woman"}, {"male", "female"}});
    }
}
