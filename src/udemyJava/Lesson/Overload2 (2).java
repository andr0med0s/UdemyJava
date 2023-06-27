package udemyJava;

class Overload2 {
    void f(byte x) {
        System.out.println("Внутри f(byte): " + x);
    }

    void f(int x) {
        System.out.println("Внутри f(int): " + x);
    }

    void f(double x) {
        System.out.println("Внутри f(double): " + x);
    }
}

class TypeConv {
    public static void main(String args[]) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i); // вызов метода ob.f(int) 
        ob.f(d); // вызов метода ob.f(double)

        ob.f(b); // вызов метода ob.f(byte) без преобразования

        ob.f(s); // вызов метода ob.f(int) с преобразованием
        ob.f(f); // вызов метода ob.f(double) с преобразованием
    }
}
