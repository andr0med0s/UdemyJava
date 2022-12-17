package udemyJava.Lesson.Lesson_22;

public class Test4 {
}
/*
class Human2 {

//    Human2(){}

    //    Human2 (String name,String surname){
//        this.name = name;
//        this.surname = surname;
//    }


    Human2(String n){
//        name = n;
        this(n, null);
    }
    Human2(String n, String s) {
        name = n;
        surname = s;
    }

    String name;
    String surname;

}

class Student2 extends Human2 {

    Student2(){
        this(5);
        System.out.println("Hello");
    }

    Student2(int i) {
        super("Petyr");
    }



    public static void main(String[] args) {
        Student2 s = new Student2();
    }
}
*/

/*
class Human2 {

   private Human2(String n){

    }

    String name;
    String surname;

}

class Student2 extends Human2 {

    Student2(String s){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Student2 s = new Student2("Ok");
    }
}

 */
class Human2 {

    Human2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String name;
    String surname;

}

class Student2 extends Human2 {
    int course;
    Student2(String name, String surname, int course ){
       super(name, surname);
       this.course = course;
    }

    public static void main(String[] args) {
        Student2 s = new Student2("Kolya", "Ivanov", 3);
        System.out.println(s.name);
        System.out.println(s.surname);
        System.out.println(s.course);
    }
}