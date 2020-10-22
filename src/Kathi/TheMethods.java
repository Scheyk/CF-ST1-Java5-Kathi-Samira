package Kathi;

import java.util.Scanner;

public class TheMethods {

    static void fillPersons(){
        char [] allPersons = new char[3];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < allPersons.length; i++){
            System.out.println("enter first name");
            String fName = in.nextLine();
            System.out.println("enter last Name");
            String lName = in.nextLine();
            System.out.println("enter age");
            int age = in.nextInt();
        }

        for (int i = 0; i < allPersons.length; i++) {
            Person.getFullName();
        }
    }

}
