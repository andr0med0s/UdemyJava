package udemyJava.Homework.Lesson_5;

public class lesson_5_1 {
    static class BankAccount {
        int id;
        String name;
        double balance;
        double popolnenieScheta (double a, double balance){
            double newBalance1 = a + balance;
                return newBalance1;
        }
        double snyatieSoScheta (double c, double balance){
            double newBalance2 = balance - c;
                return newBalance2;
        }

        public static void main(String[] args) {
            BankAccount MyAccount = new BankAccount();
            MyAccount.id = 1;
            MyAccount.name = "Andre";
            MyAccount.balance = 12.35;

//            double plusBalance = MyAccount.popolnenieScheta(10, MyAccount.balance);
//            double minusBalance = MyAccount.snyatieSoScheta(5, MyAccount.balance);
//            System.out.println("New balance popolnenie: " +plusBalance);
//            System.out.println("New balance spisanie: " +minusBalance);

            System.out.println("New balance popolnenie: " + MyAccount.popolnenieScheta(10, MyAccount.balance) );
            System.out.println("New balance spisanie: " + MyAccount.snyatieSoScheta(5, MyAccount.balance) );
        }
    }
}
