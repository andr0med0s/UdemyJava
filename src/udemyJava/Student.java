public class Student {
    public Student(
            int studentId2, String name2, String surname2, int course2, double mathAverageGrade2,
            double economicsAverageGrade2, double foreignLanguangeAverageGrade2
    ) {
        studentId = studentId2;
        name = name2;
        surname = surname2;
        course = course2;
        mathAverageGrade = mathAverageGrade2;
        economicsAverageGrade = economicsAverageGrade2;
        foreignLanguangeAverageGrade = foreignLanguangeAverageGrade2;
    }

    Student(int studentId3, String name3, String surname3, int course3) {
        this(studentId3, name3, surname3, course3, 0.0, 0.0, 0.0);
    }

    Student() {

    }

    int studentId;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguangeAverageGrade;

}

class StudentTest {

    double sredArifmOcenka(Student st) {
        double sredOcenka = (st.mathAverageGrade + st.economicsAverageGrade + st.foreignLanguangeAverageGrade) / 3;
        System.out.println("Средняя арифметическая оценка " + st.name + " " + st.surname + " : " + sredOcenka);
        return sredOcenka;
    }

    public static void main(String[] args) {

        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Niko";
        st1.surname = "Petro";
        st1.course = 3;
        st1.mathAverageGrade = 7.8;
        st1.economicsAverageGrade = 9.2;
        st1.foreignLanguangeAverageGrade = 8.8;

        Student st2 = new Student(2, "Aleks", "Sidorov", 1);
        st2.mathAverageGrade = 6.3;
        st2.economicsAverageGrade = 7.1;
        st2.foreignLanguangeAverageGrade = 8.5;

        Student st3 = new Student(3, "Anton", "Kamolov", 4, 9.1, 9, 10);

        StudentTest sTest = new StudentTest();
        sTest.sredArifmOcenka(st1);
        sTest.sredArifmOcenka(st2);
        sTest.sredArifmOcenka(st3);

    }
}
