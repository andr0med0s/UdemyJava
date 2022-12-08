package udemyJava.Lesson.Lesson_20;

import java.util.ArrayList;

public class Test4 {
   /** старое
    *  public static void main(String[] args) {
    *         ArrayList<StringBuilder> list = new ArrayList<>();
    *         StringBuilder sb = new StringBuilder ("poka");
    *         //list.add(new StringBuilder("poka"));
    *         list.add(sb);
    *         list.add(new StringBuilder("privet"));
    *         list.add(new StringBuilder("ok"));
    *        // list.add(1,new StringBuilder ("hello"));
    *         list.add(new StringBuilder ("hello"));
    *         \*
    *         for(StringBuilder sb1:list) {
    *             System.out.print(sb1 + " ");
    *         }
    *        // System.out.println(list.indexOf(new StringBuilder("poka"))); // метод equals будет сравнивать этот
    *                                                                     // объект с 4-мя объектами ArryList и
    *                                                                     // не найдет соответствия потомучто здесть
    *                                                                     // это новый объект и выведется на экран
    *                                                                     // -1 искомый объект не обнаружен
    *       //  System.out.println(list.contains(new StringBuilder("poka"))); // вывод false
    *         System.out.println(list.contains(sb)); // это один и тот же объект, метод equals в классе
    *                                                 // StringBuilder не перезаписан, не изменен..
    *      *\                                            // метод equals и двойное равно одно и то же
    *
            *System.out.println(list.toString());
    *
}
   * */

   //новое
  /**
  *  public static void main(String[] args) {
   *        ArrayList<StringBuilder> list = new ArrayList<>();
   *        list.add(new StringBuilder("poka"));
   *        list.add(new StringBuilder("privet"));
   *        list.add(new StringBuilder("ok"));
   *        list.add(1, new StringBuilder("hello"));
   *        for (StringBuilder sb : list) {
   *            System.out.print(sb + " ");
   *        }
   *        System.out.println(list.indexOf(new StringBuilder("poka"))); // вывод в консоли -1 искомый объект не обнаружен
   *
   *        System.out.println(list.contains(new StringBuilder("poka"))); //  false
   *    }
  * */

  // метод contains
  public static void main(String[] args) {
      ArrayList<StringBuilder> list = new ArrayList<>();
      StringBuilder sb = new StringBuilder("poka");
      list.add(sb);
      list.add(new StringBuilder("privet"));
      list.add(new StringBuilder("ok"));
      list.add(1, new StringBuilder("hello"));
//      for (StringBuilder sb1 : list) {
//          System.out.print(sb1 + " ");
//      }
//
//      System.out.println(list.contains(sb));
// метод equals и == для этого класса одно и тоже
      // что бы не писать for each для того чтобы выводить элементы в консоль
      System.out.println(list.toString());
  }
}

/** Класс Object. Разница между equals и ==
 * Object — это базовый класс, для всех остальных обеъктов => у всех остальных классов есть методы класса Object.
 * Сейчаc мы рассмотрим метод equals, а также разницу между equals и ==

 * public class Square {
 *     private int a;
 *     Square(int a) {
 *         this.a = a;
 *     }
 *     public static void main(String[] args) throws Exception {
 *         Square s1 = new Square(5);
 *         Square s2 = new Square(5);
 *
 *         System.out.println(s1 == s2);
 *         System.out.println(s1.equals(s2));
 *     }
 * }
 * На консоль будет выведено:
 * false
 * false
 * s1 == s2 — сравниваются ссылку, т.к. ссылки s1 и s2 разные, значит выведется false
 * s1.equals(s2) — также будет false, т.к. сравниваются ссылки на объекты
 * Но метод equals ДОЛЖЕН сравнивать значения, поэтому данный метод необходимо переопределить
 * Для того, чтобы переопределить метод equals, в IDE Eclipse необходимо сделать:
 * Source — Generete hashCode and equals, то тогда — equals будет сравнивать значения.
 *

 * @Override
 * public boolean equals(Object obj) {
 *     if (this == obj)
 *         return true;
 *     if (obj == null)
 *         return false;
 *     if (getClass() != obj.getClass())
 *         return false;
 *     Square other = (Square) obj;
 *     if (a != other.a)
 *         return false;
 *     return true;
 * }
 * Соответственно, если сейчас запустить программу, то будет выведено
 * false — сравниваются ссылки на объекты, а они разные
 * true — т.е. equals уже сравнивает значения
 * */