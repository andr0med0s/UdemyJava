package udemyJava.Lesson.Lesson_26;

public class Test7 {
    public static void main(String[] args) {
//        Animal a = new Animal();
        Lion l = new Lion();
    }
}

class Animal{
    Animal(){
        System.out.println("Constructor of Animal");
    }
    static {
        System.out.println("Static init in Animal");
    }
    {
        System.out.println("non-static init Animal");
    }
}

class Mammal extends Animal {
    Mammal(){
        System.out.println("Constructor of Mammal");
    }
    static {
        System.out.println("Static init in Mammal");
    }
    {
        System.out.println("non-static init Mammal");
    }
}

class Lion extends Mammal {
    Lion(){
        System.out.println("Constructor of Lion");
    }
    static {
        System.out.println("Static init in Lion");
    }
    {
        System.out.println("non-static init Lion");
    }
}
