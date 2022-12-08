package udemyJava.Homework;

public class lesson_5_2 {
    static class StudentTest {

       double averageGrade(Lesson_4.Student st){
            double averGrade = (st.mathAverageGrade + st.economicsAverageGrade + st.foreignLanguageGrade)/3 ;
            System.out.println("Srednyaya Arifmeticheskaya Ocenka Studenta " + st.name + st.surname + " : " + averGrade);
            return averGrade;
        }

        public static void main(String[] args) {
            Lesson_4.Student st1 = new Lesson_4.Student();
            st1.studentId = 1;
            st1.name = "Niko";
            st1.surname = "Ivanov";
            st1.course = 3;
            st1.mathAverageGrade = 7.8;
            st1.economicsAverageGrade = 3.5;
            st1.foreignLanguageGrade = 6.2;

            Lesson_4.Student st2 = new Lesson_4.Student();
            st2.studentId = 2;
            st2.name = "Sergo";
            st2.surname = "Petrov";
            st2.course = 2;
            st2.mathAverageGrade = 9.2;
            st2.economicsAverageGrade = 6.5;
            st2.foreignLanguageGrade = 7.3;

            Lesson_4.Student st3 = new Lesson_4.Student();
            st3.studentId = 3;
            st3.name = "Petro";
            st3.surname = "Sidorov";
            st3.course = 1;
            st3.mathAverageGrade = 5.8;
            st3.economicsAverageGrade = 4.8;
            st3.foreignLanguageGrade = 1.2;


            StudentTest sTest = new StudentTest();
            sTest.averageGrade(st1);
            sTest.averageGrade(st2);
            sTest.averageGrade(st3);
        }
    }
}
