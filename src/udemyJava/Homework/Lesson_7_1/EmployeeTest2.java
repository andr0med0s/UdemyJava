package udemyJava.Homework.Lesson_7_1;


import udemyJava.Homework.Lesson_7.Employee;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(5);
        // Lesson_7.Employee emp2 = new Lesson_7.Employee("Ivanov");
        // Lesson_7.Employee emp3 = new Lesson_7.Employee(555.5);

        // System.out.println(emp1.id);
        System.out.println(emp1.surname);
        // System.out.println(emp1.salary);

        emp1.getId();
        emp1.getSurname();
        emp1.getSalary();

    }


}
