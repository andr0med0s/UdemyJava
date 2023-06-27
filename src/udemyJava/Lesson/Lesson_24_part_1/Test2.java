package udemyJava.Lesson.Lesson_24_part_1;

public class Test2 {
    public static void main(String[] args) {
        //  Figura f = new Figura(); // невозможно создать объект абстрактного класса
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStoron); // compile time binding
        f1.ploshad();// run time binding
    }
}

//final abstract class Figura{ final и abstract это два противоположных понятия

abstract class Figura { // abstract класс может содержать или не содержать abstract методы

//    Figura(int kolichestvoStoron) {
//        this.kolichestvoStoron = kolichestvoStoron;
//    }

    int kolichestvoStoron = 0;

    abstract void perimetr(); //метод без тела

    abstract void ploshad(); //если есть abstract метод, то и класс должен быть abstract

    void showInfo() {
        System.out.println("Eto figura");
    }
}

class Kvadrat extends Figura {
//abstract class Kvadrat extends Figura {
//    Kvadrat(int kolichestvoStoron){
//        super(kolichestvoStoron);
//        this.kolichestvoStoron = kolichestvoStoron;
//    }

    int kolichestvoStoron = 4;
    int storona1 = 10;

    public void perimetr() {
        System.out.println("Perimetr kvadrata = " + 4 * storona1);
    }
//    public abstract void perimetr();

    public void ploshad() {
        System.out.println("Ploshad kvadrata = " + storona1 * storona1);
    }
}

class Pryamougolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 2;

    public void perimetr() {
        System.out.println("Perimetr pryamougolnika = " + 2 * (storona1 + storona2));
    }

    public void ploshad() {
        System.out.println("Ploshad pryamougolnika = " + storona1 * storona2);
    }
}

class Okrujnost extends Figura {
    int kolichestvoStoron = 0;
    int radius = 3;

    public void perimetr() {
        System.out.println("Perimetr okrujnosti = " + 2 * 3.14 * radius);
    }

    public void ploshad() {
        System.out.println("Ploshad okrujnosti = " + 3.14 * radius * radius);
    }
}

abstract class Chetirexugolnik extends Figura { //у abstract класса субкласс тоже может быть abstract
    void def() {
        System.out.println("eto chetirexugolnik");
    }
}
