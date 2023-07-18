package udemyJava.Lesson.Lesson_25;

public class Test4 {
    public static void main(String[] args) {
        String[] array1 = {"привет", "пока"};
        Object[] array2 = array1;
        String[] array3 = (String[]) array2;
        //array3[0] = new StringBuilder("ok"); // array3 типа String и его нулевой объект не может содержать StringBuilder
        array2[0] = new StringBuilder("ok"); // тип array2 Object //runtime выйдет exception array2 ссылается на массив типа String
        // а здесь на нулевой элемент массива пытаемся добавить элемент типа StringBilder, а он может содержать только элементы типа String
    }
}
