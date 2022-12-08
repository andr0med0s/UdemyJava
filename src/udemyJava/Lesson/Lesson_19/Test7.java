package udemyJava.Lesson.Lesson_19;

public class Test7 {
    public static void main(String[] args) { // пример со StringBuilder
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("ok");
        StringBuilder[] array = {sb1, sb2, sb3};
        for (StringBuilder sb : array) {
            //  sb = new StringBuilder("Hello");
            sb.append(" Java"); //  с помощью методов можно менять само значение объекта, но не сам объект
        }
        /*
        String[] array = {"privet", "poka", "ok"}; пример с типом string
        for(String s : array) {
            s=new String("Hello"); // с помощью for each нельзя заменить значения примитивных типов данных
        }
        * */

        /*
        int[] array = {0, 6, 4, 1}; пример с типом int
        for(int a : array) {
            a=3; // с помощью for each нельзя заменить значения примитивных типов данных
        }
        * //значение элемента в массиве не меняется
        * */

        /*
        *         for(int i = 0; i < array.length; i++){
            array[i] = 3;
        }
        * */

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");   // внутри традиционного лупа можно поменять объект, так как
                                                // действия совершаются не над переменной , а над самим элементом
        }
    }
}
// sb1, sb2, sb3 --- как ссылались на свои объекты, так и ссылаются
// а sb ссылается и перестает ссылаться в каждой итеррации на новый объект..
// sb локальная переменная


/**  имелось ввиду в уроке:

С помощью классического for мы можем менять элементы массива:

int[] array = {1,2,3};
for(int i=0; i<array.length; i++){
    array[i]++;
}
System.out.println(Arrays.toString(array));
С помощью forEach без дополнительного кода это сделать невозможно:

int[] array = {1,2,3};
for(int i:array){
    i++;
}
System.out.println(Arrays.toString(array));
* */