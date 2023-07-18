package udemyJava.Homework.Lesson_24;

class Lesson24{
    public static void main(String[] args) {
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

abstract class Bird extends Animal implements Speakable{
    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    public void speak(){
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animal implements Speakable{
    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish{
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    public void swim(){
        System.out.println("Mechenosec krasivaya riba, которая bistro plavaet!");
    }

    public void eat(){
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm!");
    }
}

class Pingvin extends Bird{
    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    public void eat(){
        System.out.println("Pingvin lyubit est ribu!");
    }
    public void sleep(){
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }
    public void fly(){
        System.out.println("Pingvini ne umeyut letat!");
    }
    public void speak(){
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    }
}

class Lev extends Mammal{
    Lev(String name) {
        super(name);
        this.name = name;
    }

    public void eat(){
        System.out.println("Lev, kak lyuboi xishnik, lyubit myaso!");
    }
    public void sleep(){
        System.out.println("Bolshuyu chast dnya lev spit");
    }
    public void run(){
        System.out.println("Lev - eto ne samaya bistraya koshka!");
    }
}