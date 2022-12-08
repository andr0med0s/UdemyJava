package udemyJava.Homework.Lesson_20;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson_20 {

    public ArrayList<String>abc(String... s) { //abc(String... s) --метод abc инпут параметр которого N-ое количество
                                                // параметров типа String , метод возвращает  ArrayList<String>
        ArrayList<String> aL = new ArrayList<>(); // создаем ArrayList<String> и назовем его aL
        for (String s1 : s) {                     // заполняем aL ... проходим циклом по "(String... s)"
            // типа для каждой s будет s1

            if (!aL.contains(s1)) {               //если в aL не содержится s1, то добавить отсекаем повторы
                aL.add(s1);
            }
        }
        Collections.sort(aL); //готовым методом отсортируем
        System.out.println(aL);//выведем в консоль отсортированное
        return aL;
    }

    //демонстрация метода
    public static void main(String[] args) {
        Lesson_20 l20 = new Lesson_20();
        l20.abc("privet","ok","poka","privet","как дела?","ok","Hello");
    }
}
