package Homework.Lesson_13;

public class Lesson13 {

}

class Month {

    public static void dayQuantity(int n) { // static что бы не создавать обьект Month (в котором нет смысла)
        switch (n) {
            case 2:
                System.out.println("Количество дней в месяце: 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Количество дней в месяце: 30");
                break;
            case 1:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Количество дней в месяце: 31");
                break;
            default:
                System.out.println("Месяца с таким порядковым номером не существует.");
        }
    }

    public static void main(String[] args) {
        Month.dayQuantity(0); // обращение к методу класса
        dayQuantity(1); // класс не указывается .... класс статичный.... вызов внутри класса...
        Month.dayQuantity(2);
        dayQuantity(4);
        Month.dayQuantity(-5);
    }
}