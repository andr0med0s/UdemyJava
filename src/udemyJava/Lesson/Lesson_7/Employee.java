package Lecture.Lesson7;

// import Lesson6.Employee;

public class Employee {

    double salary;

    void dvoinayaZp() {

        double result = salary * 2;
        System.out.println(" Новая зп: " + result);
    }

    Employee(double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinayaZp();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinayaZp();
    }
}

