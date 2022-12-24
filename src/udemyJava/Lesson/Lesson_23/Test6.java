package udemyJava.Lesson.Lesson_23;

public class Test6 {

}

class Animal1 {
    //String showName() {
//    static String showName() {
     String showName() {
        return "some Animal";
    }

    //    void showInfo() {
    void showInfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse1 extends Animal1 {
    //    String showName() {
//    static String showName() {
     String showName() {
//        return "Mouse";
        return "Jerry";
    }

    void showInfoAboutMouse() {
        System.out.println("Name of mouse: " + showName());
    }

    public static void main(String[] args) {
//        Animal1 a = new Mouse1();
        Mouse1 a = new Mouse1();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}