package Samira;


public class Person {
    public String name;
    public String surname;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;

    }

    public void getFullName(){
        System.out.println(name);
        System.out.println(surname.toUpperCase());
    }


}
