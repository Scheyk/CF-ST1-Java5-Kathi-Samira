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

    public void getFullName(){
        //Person newPerson = new Person();
        System.out.println("First Name: " + this.fName);
        System.out.println("Last Name: " + this.lName);
        System.out.println("Age: " + this.age);
    }

    public String getfName(){
        return  this.fName;
    }

    public void setfName(){
        this.fName = fName;
    }

    public String getlName(){
        return this.lName.toUpperCase();
    }

    public void setlName(){
        this.lName = lName;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(){
        this.age = age;
    }
}
