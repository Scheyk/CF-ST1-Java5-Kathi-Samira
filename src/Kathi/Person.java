package Kathi;

public class Person {

    private String fName;
    private String lName;
    private int age;

    public Person(String fName, String lName, int age){
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public Person(){

    }

    static void getFullName(){
        Person newPerson = new Person();
        System.out.println("First Name: " + newPerson.fName);
        System.out.println("Last Name: " + newPerson.lName);
        System.out.println("Age: " + newPerson.age);
    }
}
