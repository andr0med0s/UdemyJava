package Homework.Lesson_12;

import Lecture.Lesson_11.Student;

public class StudentTest {
    public static void method1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Студенты одинаковые");
        } else {
            System.out.println("Студенты разные");
        }
    }

    public static void method2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Имена студентов, курсы и оценки одинаковые");
                } else {
                    System.out.println("Имена студентов и курсы одинаковые, но оценки отличаются");
                }
            } else {
                System.out.println("Имена студентов одинаковые, но курсы отличаются");
            }

        } else {
            System.out.println("Имена студентов различаются");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 2, 5.5);
        Student s2 = new Student("Ivan2", 2, 6.5);
        method1(s1, s2);
        method2(s1, s2);
    }
}
