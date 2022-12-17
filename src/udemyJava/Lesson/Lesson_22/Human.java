package udemyJava.Lesson.Lesson_22;

/*
public class Human {                    //private -- видимость только внутри класса --
    private String name = "Kolz";       //private элементы не наследуются

    public String getName(){return name;}     //public методы наследуются , несмотря на то что private String
                                            // не унаследован, но с ним можно работать используя его public методы
    public void setName (String n){ name = n;}

//    private static int salary = 150;
//
//    private void work() {
//        System.out.println("Работать");
//    }
//
//    private static void rest() {
//        System.out.println("Отдыхать");
//    }

//    public Human(String n) {
//        name = n;
//    }
}
 */
/*
public class Human {
    String name = "Kolz";  //меняем private на default

    static int salary = 150;  // default модификатор доступа разрещает видеть элементы в том же пакете,
                                // в классах того же пакета, но не в классах другого пакета

    void work() {
        System.out.println("Работать");
    }

    static void rest() {
        System.out.println("Отдыхать");
    }
}
 */
public class Human {
    protected String name = "Kolz"; //меняем default на protected

                            // protected модификатор доступа разрешает видеть элементы в том же пакете,
                            // в классах того же пакета, но и в классах другого пакета в отличие от default

    protected static int salary = 150;

    protected  void work() {
        System.out.println("Работать");
    }

    protected static void rest() {
        System.out.println("Отдыхать");
    }
}

class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
//        System.out.println(s.name);
        System.out.println(s.name);
//        System.out.println(Student.salary);
//        s.work();
//        Student.rest();
    }
}