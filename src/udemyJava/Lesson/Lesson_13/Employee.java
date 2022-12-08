package Lecture.Lesson_13;

public class Employee {
    public static void main(String[] args) {
        switch ("Среда") {
            case "Понедельник":

            case "Вторник":

            case "Среда":

            case "Четверг":

            case "Пятница":
                System.out.println("Работа до 18:00");
                break;
            case "Суббота":
                System.out.println("Работа до 14:00");
                break;
            case "Воскресенье":
                System.out.println("Работы нет");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
    }
}
