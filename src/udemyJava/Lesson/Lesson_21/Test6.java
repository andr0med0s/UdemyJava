package udemyJava.Lesson.Lesson_21;

public class Test6 {
   int abc(){ // метод abc() возвращает int в параметр ничего не принимает
       return 5; // просто возвращает 5
   }

   int abc2(int i){
       if(i>10){
           return 5; // return необязательно должно быть последним statement-ом (утверждением)
       }else {
           return 10;
       }
   }

//   void abc3(){
//       System.out.println("hello");
//       return; // так написать можно return последнее утверждение(statement) в методе
//  //     System.out.println(""); //после return написать ничего нельзя
//   }

    void abc3(int i2){
       if(i2 > 3){
           return; // здесь смысл в return есть
       }
        System.out.println("hello");
        return; //здесь return смысла неимеет

    }

    public static void main(String[] args) {
        int a  = new Test6().abc(); // вызываем метод abc()  и присваиваем его вывод переменной int a,
                                    // теперь int a будет равен 5
    new Test6().abc(); // присваивание к переменной не обязательно
   }
}
