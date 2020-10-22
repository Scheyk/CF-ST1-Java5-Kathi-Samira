package Kathi;

public class Main {

    public static void main(String[]args){

        Person one = new Person("Susi", "Maier", 25);
        Person two = new Person("Herbert", "Wald", 33);

        one.getFullName();
        System.out.println("Age: " + two.getAge());
        System.out.println("first Name: " + two.getfName());
        System.out.println("last name: " + two.getlName());
        System.out.println("last name: " + one.getlName().toUpperCase());


    }
}
