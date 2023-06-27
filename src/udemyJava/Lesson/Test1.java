package udemyJava;

public class Test1 {
    int sum(int a, int b, int c) {
        // int result = a + b + c ;
        // return result;
        return a + b + c;
    }

    int sredArif(int x, int y, int z) {
        // return (a+b+c)/3;
        return sum(x, y, z) / 3;
    }
}

// class Test{
//    public static void main(String[] args) {
//        Integer num1 = 128;
//        Integer num2 = 128;
////        Integer num1 = Integer.valueOf(128);
////        Integer num2 = Integer.valueOf(128);
//
//        if(num1==num2){
//            System.out.println("num1 == num2");
//        }
//        else{
//            System.out.println("num1 != num2");
//        }
//        if(num1.equals(num2)){
//            System.out.println("num1 эквивалентен num2");
//        }else{
//            System.out.println("num1 не эквивалентен num2");
//        }
//    }
//}
///*По умолчанию при старте JVM создает кэш из 256 чисел в диапазоне -128 до 127 включительно
//если число в пределах диапазона , то ссылки ведут на один и тот же экземпляр Integer.
//Если выход за границы предела, то ссылки ведут на разные экземпляры независимо от их значения.
// Поэтому сравнивать по значению надо всегда через equals()
//Также, этот кеш касается всех целочисленных оберток включая
// Byte, Short, Long (для того же диапазона значений) и Character (для дипазона 0..127).
// */