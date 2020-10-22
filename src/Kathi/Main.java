package Kathi;

public class Main {

    public static void main(String[]args){

        /*  Task 1
        Person one = new Person("Susi", "Maier", 25);
        Person two = new Person("Herbert", "Wald", 33);

        one.getFullName();
        System.out.println("Age: " + two.getAge());
        System.out.println("first Name: " + two.getfName());
        System.out.println("last name: " + two.getlName());
        System.out.println("last name: " + one.getlName().toUpperCase());
         */

        BankAccount one = new BankAccount("Susi",440);
        BankAccount two = new BankAccount("Herbert",546);

        one.addMoney(40);
        one.withdraw(500);
        two.withdraw(30);
        two.addMoney(400);


    }
}
