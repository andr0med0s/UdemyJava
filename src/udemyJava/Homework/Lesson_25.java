package udemyJava.Homework;


public class Lesson_25 {

    public static void main(String[] args) {
        /*

        Mechenosec m = new Mechenosec("Karl");
        System.out.println(m.name);
        m.sleep();
        m.eat();
        m.swim();
        Speakable s1 = new Pingvin("Kovalski");
        s1.speak();
        Animal a1 = new Lev("Leva1");
        System.out.println(a1.name);
        a1.sleep();
        a1.eat();
        Mammal m1 = new Lev("Leva2");
        System.out.println(m1.name);
        m1.run();
        m1.sleep();
        m1.speak();
        m1.eat();

         */
        Animal a1 = new Mechenosec("Karl_1");
        Animal a2 = new Pingvin("Kovalski");
        Animal a3 = new Lev("Leva_1");
        Fish f1 = new Mechenosec("Karl_2");
        Bird b1 = new Pingvin("Kovalski_2");
        Mammal m1 = new Lev("Leva_2");
        Mechenosec mech1 = new Mechenosec("Karl_3");
        Pingvin p1 = new Pingvin("Kovalski_3");
        Lev l1 = new Lev("Leva_3");
        Speakable s1 = new Pingvin("Kovalski_4");
        Speakable s2 = new Lev("Leva_4");
        Animal[] array1 = {a1, a2, a3, f1, b1, m1, mech1, p1, l1};
        Speakable[] array2 = {s1, s2, b1, m1, p1, l1};
        for (Animal a : array1) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.swim();
                m.sleep();
            } else if (a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.speak();
                p.fly();
            } else if (a instanceof Lev) {
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.run();
                l.sleep();
                l.speak();
            }
            System.out.println("________________");
        }
        for (Speakable s : array2) {
            if (s instanceof Pingvin) {
                Pingvin p = (Pingvin) s;
                System.out.println(p.name);
                p.fly();
                p.speak();
                p.eat();
                p.sleep();
            } else if (s instanceof Lev) {
                Lev l = (Lev) s;
                System.out.println(l.name);
                l.speak();
                l.sleep();
                l.run();
                l.eat();
            }
            System.out.println("___________________");
        }
    }
}

abstract class Animal {
    Animal(String name) {
        this.name = name;
    }

    String name;

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("Vsegda interesno nablyudat, как spyat ribi");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    public void speak() {
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    public void swim() {
        System.out.println("Mechenosec krasivaya riba, которая bistro plavaet!");
    }

    public void eat() {
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm!");
    }
}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    public void eat() {
        System.out.println("Pingvin lyubit est ribu!");
    }

    public void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }

    public void fly() {
        System.out.println("Pingvini ne umeyut letat!");
    }

    public void speak() {
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    }
}

class Lev extends Mammal {
    Lev(String name) {
        super(name);
        this.name = name;
    }

    public void eat() {
        System.out.println("Lev, kak lyuboi xishnik, lyubit myaso!");
    }

    public void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit");
    }

    public void run() {
        System.out.println("Lev - eto ne samaya bistraya koshka!");
    }
}


