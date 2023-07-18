package udemyJava.Lesson.Lesson_25;

//public class Test1 {
//    public static void main(String[] args) {
////        Driver [] array1 = {new Driver(), new Driver()};
////        Employee [] array2 = {new Driver(), new Driver(), new Teacher(), new Doctor() };
////        Help_able [] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor() };
//
//
//        Employee emp1 = new Teacher();
//        Employee emp2 = new Driver();
//        Employee emp3 = new Doctor();
////        Help_able h = new Teacher();
//
//        Employee[] array2 = {emp1, emp2, emp3};
//
//        String s1 = null;
//        Object o = new Object();
//
////        for (Employee emp : array2) {
////            emp.work();
////        }
//
////        System.out.println(emp1 instanceof Employee);
////        System.out.println(emp1 instanceof Help_able);
//        System.out.println(o instanceof Teacher);
//
////        h.work(); в Help_able нет метода work
//        //       emp1.help();
//
////        emp1.work();
////        emp2.work();
////        emp3.work();
//
//
//    }
//}

//abstract class Employee implements Help_able {
//abstract class Employee {
//    void sleep() {
//        System.out.println("Employee sleeps");
//    }
//
//    abstract void work();
//}
//
//class Teacher extends Employee implements Help_able {
//    public void help() {
//        System.out.println("Teacher helps");
//    }
//
//    void work() {
//        System.out.println("Teacher works");
//    }
//}
//
////class Driver extends Employee{
//class Driver extends Employee implements Help_able {
//    public void help() {
//        System.out.println("Driver helps");
//    }
//
//    void work() {
//        System.out.println("Driver works");
//    }
//}
//
////class Doctor extends Employee{
//class Doctor extends Employee implements Help_able {
//    public void help() {
//        System.out.println("Doctor helps");
//    }
//
//    void work() {
//        System.out.println("Doctor works");
//    }
//}

//interface Help_able {
//    void help();
//}