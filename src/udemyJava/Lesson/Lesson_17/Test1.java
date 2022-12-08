package udemyJava.Lesson.Lesson_17;
class Car{}

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(); // по дефолту, умолчанию вместимость составляет 16 символов/мест  (массив для 16 символов/мест )
        StringBuilder sb2 = new StringBuilder("Good Day!!"); // в этой строке выделяется 10 (сам стринг пробелы, знаки) + 16 по дефолту резервируется в памяти
        StringBuilder sb3 = new StringBuilder(50); // количество символов/мест ... вместимость StringBuilder
        StringBuilder sb4 = new StringBuilder(sb3); // ссылается не на объект sb3, на другой объект со значением sb3

        System.out.println(sb3.length()); // вывод длины массива (в данном случае 0 при том что места для него 50 )
        System.out.println(sb2.charAt(5)); // вывод значения (какой символ находится на месте данного индекса)
        System.out.println(sb2.indexOf("z")); // вывод индекса (на каком месте в массиве находится символ) (в данном случае -1 потому что не найден)
        System.out.println(sb2.indexOf("o",2)); // типа поиск для вывода символа "o" начиная с индекса 2 в массиве представляемом строкой, набором символов
        String s = sb2.substring(5); // Вывод значений начиная c 5 позиции с пятого индекса присвоенный переменной s
        System.out.println(s);
        String s2 = sb2.substring(5, 8); // в оутпуте String
        System.out.println(s2);

        System.out.println(sb2.subSequence(5, 8)); // в оутпуте CharSequence
//
//        sb2.append(22); //в оутпуте StringBuilder  метод append в параметр принимает Data type любые значения
//        System.out.println(sb2);
//        sb2.append(true);
//        System.out.println(sb2);
//        sb2.append(sb2);
//        System.out.println(sb2);
//
//        sb2.append( new Car());
//        sb2.append(true);
//        System.out.println(sb2);
        System.out.println(sb2.insert(4, 55));
        System.out.println(sb2.insert(sb2.length(), "Hello"));

        StringBuilder sb10 = new StringBuilder("Hello World");
        sb10.delete(3, 6); // удаляется интервал символов из списка массива начиная от индекса 3 до индекса 6
        System.out.println(sb10);
        sb10.deleteCharAt(6); // удаляется индекс символа из списка массива
        System.out.println(sb10);
        sb10.reverse();
        System.out.println(sb10);
        StringBuilder sb12 = new StringBuilder("Vsem Privet");
        sb12.replace(0, 5,"Pete");
        System.out.println(sb12);
        System.out.println(sb12.capacity());
        System.out.println(sb1.capacity());
    }
}
