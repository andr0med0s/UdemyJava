package udemyJava.Lesson.Lesson_18;

public class Test1 {
    public static void main(String[] args) {
        int [] array1; // int примитивный тип данных
        String [] array2; // String референс тип данных
        double [][] array3;
        int [][] array10;
        double [] array7;

        array1 = new int[8];
        array2 = new String [3];
        array3 = new double[4][2];
        array10 = new int[3][];
        array7 = new double[2];

        //    System.out.println(array2.length); // length в данном случае (у массива)переменная, у стринга это метод (length() метод)
        array2[0] = "privet";
        array2[1] = "poka"; // статическая инициализацмя
        array2[2] = "ok";

        array3[0][0] = 3.14;
        array3[2][1] = 3.14;

        double [] array5;
        array5 = new double[2];
        array5 [0] = 2.5;
        array5 [1] = 3.5;
        array7 = array5; // ссылаются на один и тот же объект

        array3 [1] = array5;

        System.out.println(array3[1][0]);
    }

}
