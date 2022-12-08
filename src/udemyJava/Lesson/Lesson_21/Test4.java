package udemyJava.Lesson.Lesson_21;

public class Test4 {
    public void abc(String s){ // * так и примитивные
        System.out.println(s);
    }
    public void abc(boolean b){
        System.out.println(b);
    }

    // *перегружаемые методы могут принимать в параметры как ссылочные типы
    private StringBuilder abc(StringBuilder sb){ // возвращаемый тип StringBuilder
        System.out.println(sb);
        return new StringBuilder("poka");
    }
}
