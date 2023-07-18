package udemyJava.Lesson.Lesson_25;

public class Test2 {
    public static void main(String[] args) {
        Jumpable j = new Man();
        Man m = new Man();
        Student s = new Student();
        if(j instanceof Jumpable){
            System.out.println("j is Jumpable");
        }

        if(m instanceof Human){
            System.out.println("m is Human");
        }

//        if(s instanceof Human){
//            System.out.println("s is Human");
//        } нет связи между s и Human компилятор  НЕ позволяет так писать (с class-om так писать нельзя)

        if(s instanceof Jumpable){System.out.println("s is Jumpable");} //компилятор так позволяет писать
                //он не знает implemets ли class Student Jumpable (с interface так писать можно )
    }
}

interface Jumpable{}
class Human implements Jumpable{}
class Man extends Human{}
class Student{}
