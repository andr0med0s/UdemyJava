package udemyJava.Lesson.Lesson_20part3__23vid.arraylistmethods;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Mihail");
        map.put(778, "Sidorov Srg");
        map.put(779, "Petrov Alex");
        map.put(780, "Alekseev Zahar");
        map.put(779, "Grigor Pasha"); // дубликакты не поддерживаются
        map.put(781, "Petrov Alex");
        map.remove(779);
        System.out.println("map = " + map);

    }
}
