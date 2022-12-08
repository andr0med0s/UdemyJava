package udemyJava.Lesson.Lesson_20;

import java.util.ArrayList;

public class Test3 {
   /**старое
   *  public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for(int i=0; i< list.size(); i++){
            list.get(i).append("!!!"); // поочереди вызывается елемент и добавляется в конец записи !!!
                                        // для каждого элемента, таким образом изменется каждый элемент ArrayList
        }
        for (StringBuilder sb:list) {
            System.out.print(sb + " ");
        }
        System.out.println();
       // list.remove(new StringBuilder("hello"));  // удаления не произойдет сравнение объектов метод equals
                                                    // У стрингбилдер equals неперезаписывается это то же самое
                                                    // что два равно если две переменные ссылаются на один
                                                    // и тот же объект то возвращяется true, но здесь два
                                                    // разных объекта hello поетому equals возвращяет false и удаления
                                                    // не произойдет
        list.remove(sb1); // произойдет удаление sb1 это sb1 и происходит удаление ссылаются на один и тот же объект
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
    }
   * */
   public static void main(String[] args) {
       ArrayList <StringBuilder> list = new ArrayList<>();
       StringBuilder sb1 = new StringBuilder("hello");
       StringBuilder sb2 = new StringBuilder("ok");
       StringBuilder sb3 = new StringBuilder("privet");
       list.add(sb1);
       list.add(sb2);
       list.add(sb3);
       for(int i=0; i< list.size(); i++){
           list.get(i).append("!!!"); // с каждым шагом поочереди вызываются элементы и на конец
           // записи добавляются "!!!"
           // для каждого элемента, таким образом изменется каждый элемент ArrayList
       }
       // с помощью for each выводятся элементы ArrayList в консоль
       for (StringBuilder sb : list) {
           System.out.print(sb + " ");
       }

       System.out.println();
      // list.remove(2); удаление по индексу
       //list.remove(new StringBuilder("hello"));// удаления не произошло ... два разных объекта,
       // но с одинаковым значением "hello" ... сравнение происходит с помощью метода equals и у StringBuilder
       // это то же самое что два равно, а два равно true тогда когда две переменные ссылаются на один и тот же объект
       // в данном случае "hello" в ArrayList и "hello" которое хотим удалить два разных объекта,
       // но с одинаковым значением
       list.remove(sb1); // удаление происходит так как происходит проверка sb1 в ArrayList это sb1 которое хотим
       // удалить метод equals вернет true, переменная sb1 в ArrayList и переменная sb1 которую хотим удалить ссылаются
       // на один и тот же объект
       for (StringBuilder sb : list) {
           System.out.print(sb + " ");
       }
   }

}
