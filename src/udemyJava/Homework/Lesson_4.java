package udemyJava.Homework;

public class Lesson_4 {
    public static class Student {
        int studentId;
        String name;
        String surname;
        int course;
        double mathAverageGrade;
        double economicsAverageGrade;
        double foreignLanguageGrade;


    }

    static class StudentTest{
        public static void main(String[] args) {
            Student st1 = new Student();
            st1.studentId = 1;
            st1.name = "Niko";
            st1.surname = "Ivanov";
            st1.course = 3;
            st1.mathAverageGrade = 7.8;
            st1.economicsAverageGrade = 3.5;
            st1.foreignLanguageGrade = 6.2;

            Student st2 = new Student();
            st2.studentId = 2;
            st2.name = "Sergo";
            st2.surname = "Petrov";
            st2.course = 2;
            st2.mathAverageGrade = 9.2;
            st2.economicsAverageGrade = 6.5;
            st2.foreignLanguageGrade = 7.3;

            Student st3 = new Student();
            st3.studentId = 3;
            st3.name = "Petro";
            st3.surname = "Sidorov";
            st3.course = 1;
            st3.mathAverageGrade = 5.8;
            st3.economicsAverageGrade = 4.8;
            st3.foreignLanguageGrade = 1.2;

            System.out.println("Средняя арифметическая оценка: " + st1.name + " " + st1.surname + " курс " +  st1.course + " = " +
                    (st1.mathAverageGrade + st1.economicsAverageGrade + st1.foreignLanguageGrade)/3 );
            System.out.println("Средняя арифметическая оценка: " + st2.name + " " + st2.surname + " = " + st2.course +
                    (st2.mathAverageGrade + st2.economicsAverageGrade + st2.foreignLanguageGrade)/3 );
            System.out.println("Средняя арифметическая оценка: " + st3.name + " " + st3.surname + " = " + st3.course +
                    (st3.mathAverageGrade + st3.economicsAverageGrade + st3.foreignLanguageGrade)/3 );
        }

    }
}

