package udemyJava.Lesson.Lesson_20;

import java.util.ArrayList;

public class Test2 {
    /**
     * новое закомментировано для написания Test3 пример удаления String
     * public static void main(String[] args) {
     * //ArrayList <String> list = new ArrayList<>();
     * ArrayList <StringBuilder> list = new ArrayList<>();
     * // чтобы изменять не сам объект , а его значение используем StringBuilder
     * list.add(new StringBuilder("poka"));
     * list.add(new StringBuilder("privet"));
     * list.add(new StringBuilder("ok"));
     * list.add(1,new StringBuilder ("hello"));
     * //  list.add(5,"ok"); это не верно выдаст ошибку : Index: 5, Size: 4.....
     * //  Каппасити  ArrayList равен 4 , а объект добавляется на 5 инндекс
     * for(StringBuilder s : list) {
     * System.out.print(s + " ");
     * }
     * System.out.println();
     * // System.out.println(list.get(4)); индекс 4 появится при размере 5  Index 4 out of bounds for length 4
     * <p>
     * //        for (int i=0; i< list.size(); i++){
     * //        System.out.println(list.get(i));}
     * <p>
     * //  list.set(1,"!!!"); // убирается для теста 3
     * //  list.remove("poka"); // строка для теста 3
     * //   list.remove(new String("poka"));     // строка для теста 3 метод equals
     * // ( идет проверка всех элементов Array List ) возвращает true когда
     * // значение объектов одинаковое поэтому происходит удаление
     * // у String-а метод equals возвращает true когда значение объектов одинаковое
     * // при remove новый массив не создался, а элементы сместились
     * <p>
     * ArrayList <StringBuilder> list2 = new ArrayList<>();
     * list2.add(new StringBuilder("Petrov"));
     * list2.add(new StringBuilder("Sidorov"));
     * //        ArrayList <StringBuilder> list3 = new ArrayList<>();
     * //        StringBuilder sb1 = new StringBuilder("hello");
     * //        StringBuilder sb2 = new StringBuilder("ok");
     * //        StringBuilder sb3 = new StringBuilder("privet");
     * //        list3.add(sb1);
     * //        list3.add(sb2);
     * //        list3.add(sb3);
     * //        list.addAll(list3);    StringBuilder нельзя добавить в ArrayList String разные типы
     * // list.addAll(list);
     * // list.addAll(1,list2);
     * list.addAll(list2);
     * <p>
     * for(StringBuilder s : list) {
     * System.out.print(s + " ");
     * }
     * //   list2.set(1, new StringBuilder("Ivanov"));
     * list2.get(1).append("!");
     * System.out.println();
     * for(StringBuilder s : list) {
     * System.out.print(s + " ");
     * }
     * //        list.clear();
     * //        System.out.println();
     * //        System.out.println();
     * //        System.out.println();
     * //        for(StringBuilder s : list) {
     * //            System.out.print(s + " ");
     * //        }
     * <p>
     * }
     */
    /**
     * Test 2 без комментарие и заметок
     * public static void main(String[] args) {
     * ArrayList<String> list = new ArrayList<>();
     * list.add("poka");
     * list.add("privet");
     * list.add("ok");
     * list.add(1, "hello");
     * for (String s : list) {
     * System.out.print(s + " ");
     * }
     * System.out.println();
     * list.set(1, "!!!");
     * for (String s : list) {
     * System.out.println(s + " ");
     * }
     * }
     */
// собственно Test 3

    /**
     * метод remove
     * public static void main(String[] args) {
     * ArrayList<String> list = new ArrayList<>();
     * list.add("poka");
     * list.add("privet");
     * list.add("ok");
     * list.add(1, "hello");
     * for (String s : list) {
     * System.out.print(s + " ");
     * }
     * System.out.println();
     * //        list.set(1, "!!!");
     * //        list.remove("poka");
     * list.remove(new String("poka")); // к примеру пусть создастся новый объект со значением "poka" с помощью
     * // метода equals идет проверка всех элементов ArrayList сравнивается все значения с удаляемым значением когда совпадают
     * // значения происходит удаление, потому что у string метод equals возвращает true когда значения одинаковые
     * // после удаления не создается новый массив , а все элементы смещаются на шаг влево
     * for (String s : list) {
     * System.out.print(s + " ");
     * }
     * <p>
     * }
     */
    public static void main(String[] args) {
/**закомментировано для продолжения используем ArrayList с данными типа  StringBuilder
 *         ArrayList<String> list = new ArrayList<>();
 *         list.add("poka");
 *         list.add("privet");
 *         list.add("ok");
 *         list.add(1, "hello");
 *         for (String s : list) {
 *             System.out.print(s + " ");
 *         }
 *         System.out.println();
 *         ArrayList<String> list2 = new ArrayList<>();
 *         list2.add("Petrov");
 *         list2.add("Sidorov");
 *
 // * **         нельзя добавить в list list3 потому что разные типы данных у ArrayList  list и ArrayList list3
 // *  *         ArrayList <StringBuilder> list3 = new ArrayList<>();
 // *  *         StringBuilder sb1 = new StringBuilder("hello");
 // *  *         StringBuilder sb2 = new StringBuilder("ok");
 // *  *         StringBuilder sb3 = new StringBuilder("privet");
 // *  *         list3.add(sb1);
 // *  *         list3.add(sb2);
 // *  *         list3.add(sb3);
 // *  *         list.addAll(list3);
 // *  *         нельзя добавить в list list3 потому что разные типы данных у ArrayList  list и ArrayList list3
 // *  *
 *
 *
 *list.addAll(list2);
 *         // list.addAll(1,list2); // с первого индекса list  будут добавляться элементы list2
 *for (String s : list) {
 *System.out.print(s + " ");
 *}
 *list2.set(1, "Ivanov");// в list2 на 1 индекс установим новое значение заместо значения "Sidorov"
 *         // чтобы изменить значение уже нужено работать со StringBuilder
 *System.out.println();
 *for (String s : list) {
 *System.out.print(s + " ");
 *}
 *         // новое значение "Ivanov" установленно не будет , потому что переменная из list2 перестала
 *         // ссылаться на элемент "Sidorov" , а переменная из list по прежнему ссылается на значение "Sidorov"
 *         // list1  s1---ссылается на петров list2 s1---ссылается на петров
 *         // list2  s2---больше не ссылается на сидоров, а ссылается на иванов, то list1 s2---по прежнему ссылается на сидоров
 *}
 * */

        //чтобы изменить значение, уже нужно работать со StringBuilder
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(1, new StringBuilder("hello"));
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Sidorov"));

        list.addAll(list2);
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
        list2.get(1).append("!");
        System.out.println();
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }

        //list1 s1 --> ссылается на петров list1 s2 --> ссылается на sidorov
       // метод append("!");добавит ! на конец значения , то есть ообъект тот же но изменилось значение а именно
        //list1 s2 и list2 s2 ссылаются на sidorov!
        //list2 s1 --> ссылается на петров list2 s2 --> ссылается на sidorov!

/** // метод clear очистка list
*         list.clear();
        System.out.println("\n--------------");
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
* */


    }
}
