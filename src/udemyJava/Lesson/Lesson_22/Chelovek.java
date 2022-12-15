package udemyJava.Lesson.Lesson_22;

public class Chelovek {
    final String pol;

    public Chelovek(String pol) {
        this.pol = pol;
    }

    //    String name;
    //    int vozrast;
    //    int ves;

    private boolean clever;

    public boolean isClever() {
        return clever;
    }

    //  private String name; //private видно только внутри класса //для переменной String name применили инкапсуляцию
    private StringBuilder name;

    //    public String getName() {
//        return name;
//    }
//    public StringBuilder getName() {
//        return name;
//    }

    public StringBuilder getName() { // Если возвращаемый тип (return type) метода get - это изменяемый тип данных,
                                    // то лучше возвращать его копию
                                    // В данном случае StringBuilder это изменяемый тип
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    //    public void setName(String s) {
//        name = s;
//    }
    public void setName(StringBuilder s) {
        name = s;
    }

    private int vozrast;

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int i) {
        if (i > 0) {
            vozrast = i;
        }
    }

    private int ves;

    public int getVes() {
        return ves;
    }

    public void setVes(int i) {
        if (i > 0) {
            ves = i;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Chelovek с = new Chelovek("male");
//        с.name = "Petya";
//        с.vozrast = 2500;
//        с.ves = -65;
//        с.setName("Kolya");
        с.setName(new StringBuilder("Коля"));
//        с.setVozrast(35);
//        с.setVes(75);
//        System.out.println(с.getName());
//        System.out.println(с.getVozrast());
//        System.out.println(с.getVes());
//        с.setVes(-30);
//        System.out.println(с.getVes());
        с.getName().append("!!!"); // В данном случае StringBuilder это изменяемый тип,
                                    // так если его можно изменить к примеру используя метод append()
                                            // Но так как возвращаем его копию,
        System.out.println(с.getName()); // то изменения не выводятся
    }
}
