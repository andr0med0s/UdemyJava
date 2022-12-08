package udemyJava.Lesson.Lesson_17;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello, friend!");
        String s = null;
//        s = sb1.append("How are you?").substring(sb1.indexOf('f'),sb1.indexOf('!')); // метод indexOf  оперирует типом String, а здесь тип char
// в данном случае разница в видах кавычек , а это значит разница в типах '' --- char "" --- string
        s = sb1.append("How are you?").substring(sb1.indexOf("f"),sb1.indexOf("!"));
        System.out.println(s);
        // StringBuilder схож с StringBuffer отличие в том что StringBuffer используется при многопоточности
    }
}
