class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double uvelichenieZarplaty() {
        salary *= 2;
        return salary;
    }

}

class EmployeeTest {
    public static void main(String args[]) {
        Employee emp1 = new Employee(1, "Ivanov", 25, 555.55, "IT");
        Employee emp2 = new Employee(2, "Petrov", 30, 888.88, "Sales");

        emp1.uvelichenieZarplaty();
        System.out.println("Новая зарплата работника " + emp1.surname + " : " + emp1.salary);

        double newSalary = emp2.uvelichenieZarplaty();
        System.out.println("Новая зарплата работника " + emp2.surname + " : " + newSalary);
        // emp2.uvelichenieZarplaty();
        // System.out.println("Новая зарплата работника " + emp2.surname + " : " + emp2.salary);
    }
}