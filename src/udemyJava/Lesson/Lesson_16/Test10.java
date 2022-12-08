package udemyJava.Lesson.Lesson_16;

public class Test10 {
    public static void main(String[] args) {
        String x = "privet";
        String y = "_privet".trim(); // если убрать пробел метод trim ничего ни сделает и вернет тот же обьект соответственно выражение x==y будет true
        //с пробелом метод выполнит действие, уберет пробел с создаст новый объект.. соответственно выражение x==y будет false
        System.out.println(x == y);
    }
}
