package udemyJava.Lesson.Lesson_21;

public class Test2 {
    public static void main(String[] args) {
        String s1, s2; // две ссылки
        s1 = new String("privet"); // s1 ссылается на "privet"
        s2 = new String("poka");// s2 ссылается на "poka"
        s1 = s2; // s1 перестает ссылаться на "privet" и ссылается на "poka" ///privet может быть удалено ничто не ссылается на него
        String s3 = s1; //s3 ссылается на s1, а s1 ссылается на s2
        s1 = null;// s1 перестает ссылаться на что либо
    }// на этой строке где метод main закончился "poka" может быть удалено
// пояснение в скриншоте
}
//class Test{             //рекруссивный конструктор
//    public Test(){        //конструктор будет вызываться бесконечно
//        this();
//    }
//}