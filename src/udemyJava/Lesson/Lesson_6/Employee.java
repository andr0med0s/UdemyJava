package Lecture.Lesson6;

public class Employee {

    Employee(int id2, String surname2, int age2) {
        // // id = id2;
        // // surname = surname2;
        // // age = age2;

        // this(surname2, age2);
        // id=id2;
        this(id2, surname2, age2, 0.0, null);
    }

    public Employee(String surname3, int age3) {
        // surname = surname3;
        // age = age3;
        this(0, surname3, age3, 0.0, null);
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4) {
        // this(id4, surname4, age4);

        // // id = id4;
        // // surname = surname4;
        // // age = age4;

        // salary = salary4;
        // department = department4;

        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;

}

class EmployeeTest {

    public static void main(String args[]) {

        Employee emp1 = new Employee(1, "Petrov", 25);
        System.out.println(emp1.id + " " + emp1.surname);

        Employee emp2 = new Employee("Sidorov", 65);
        System.out.println(emp2.surname + " " + emp2.age);

        Employee emp3 = new Employee(2, "Ivanov", 20, 100.35, "It");
        System.out.println(emp3.department);
    }

}