package udemyJava.Lesson.Lesson_20part2___22vid.somemethods;


import java.util.Arrays;

//compare
//mismath метод находит индекс первого расхождения
public class Test2 {

    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {1,2,3,5};
        int [] array5 = {1,2,3,5};

        char [] array3 = {'p','r','i','v','e','t'};
        char [] array6 = {'p','r','i','v','e','t', 'c'};
        char [] array4 = {'p','r','i','v','i','v','k','a'};
        char [] array7 = null;

//        System.out.println(Arrays.compare(array1, array2)); // метод compare возвращает -1 , когда первый массив меньше второго
//        System.out.println(Arrays.compare(array2, array1)); // метод compare возвращает 1 , когда первый массив больше второго
//        System.out.println(Arrays.compare(array2, array5)); // -------------------------0, когда равны
//        System.out.println(Arrays.compare(array3, array6)); // вывод -1 префикс array3 появляется раньше array6
//        System.out.println(Arrays.compare(array3, array7)); //  вывод 1

        System.out.println(Arrays.mismatch(array2, array5)); // когда одинаковые возвращяется -1
        System.out.println(Arrays.mismatch(array2, array1)); // возвращает индекс первого расхождения

        System.out.println(Arrays.mismatch(array3, array4));
    }
}

//привет        //префикс это одинаковая часть
//прививка