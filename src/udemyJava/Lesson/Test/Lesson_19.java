package udemyJava.Lesson.Test;

class Lesson19 {

    public static String[] abc(String[]... array1) { // метод abc параметр которого
                                                     // varargs("список аргументов переменной длины")
                                                     // массивов String
                                                     //  *String[]* abc(String[]... array1) {  *-* output метода abc
    int length = 0; // изначально не известно какой длины будет массив // перед тем как создать новый массив нужно
                     // определиться с его длинной
    for (String[] array2 : array1) { // String[] array2 является элементом массива array1 ,"то есть
                                      // вот это  (String[]... array1) двумерный массив"
        length += array2.length; // сумма длин всех одномерных массивов используемые в параметре метода abc "вот
                                // здесь : (String[]... array1) "
        }
        String[] target = new String[length]; // новый одномерный  массив target с длиной length
        int count = 0;
        for (String[] array2 : array1) { // это  outer  for each loop // элементом одномерного массива array1 является String[] array2
            for (String s : array2) { // это inner  for each loop // элементом массива array2 является String s
                target [count] = s; // присваивание каждому элементу массива target значение s
                count++; // count индекс каждого последующего элемента массива target
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] target = abc(new String[] {"ok", "privet", "poka"}, new String[] {"ok", "hello", "bye"}); // создается
        // новый массив String[] target, который является output-ом метода abc в котором задействованы два одномерных
        // массива new String[] {"ok", "privet", "poka"} и new String[] {"ok", "hello", "bye"}


        for (String s : args) { // for each loop будет делать итерации по каждому элементу массива args
            for (int i = 0; i < target.length; i++) { // используется традиционный луп, так как в foreach loop
                                                      // нельзя менять target  без дополнительного кода
                //здесь итерации по каждому элементу массива target
                if (s.equals(target[i])) { // если написать наоборот то будет выходить ошибка NullPointerException
                    //здесь происходит сравнивание элементов, если равны то target[i] = null
                    target[i] = null;
                    }
                }
            }
            for (String s : target) { // здесь выводятся сначения массива target
                System.out.print(s + " ");
            }
            System.out.println();
    }
 }

// Итак, вместо того, чтобы задавать конкретное количество аргументов -
// два, три, четыре - мы можем сказать Java, что мы не знаем,
// сколько их будет Но метод все равно сработает,
// и будет иметь доступ ко всем заданным аргументам.

// VarArgs переводится как Variable Arguments List - что-то типа "список аргументов переменной длины",
// или "список переменной длины, в которой лежат аргументы


