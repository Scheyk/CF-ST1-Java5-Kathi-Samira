package Kathi;

public class BankAccount {

    private String name;
    private double accountBalance;

    public BankAccount(String name, double accountBalance){
        this.name = name;
        this.accountBalance = accountBalance;
    }

    public BankAccount(){
    }

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public void setBalance(){
        this.accountBalance = accountBalance;
    }

    public Double getBalance(){
        return this.accountBalance;
    }

    public void addMoney(double add){
        System.out.println(this.name + "  " + this.accountBalance);
       this.accountBalance += add;
        System.out.println("Hello " + this.name + ", we added " + add + " on you Account.");
        System.out.println("On your Account is now: " + this.accountBalance + " €");
        System.out.println(" ");
    }

    public void withdraw(double minus){
        if(minus > this.accountBalance){
            System.out.println(this.name + "  " + this.accountBalance);
            System.out.println("Hello " + this.name + ", you have not enought money!");
            System.out.println(" ");
        } else {
            System.out.println(this.name + "  " + this.accountBalance);
            this.accountBalance -= minus;
            System.out.println("Hello " + this.name + ", we have withdrawn " + minus + " from your Account.");
            System.out.println("On your Account is now: " + this.accountBalance + " €");
            System.out.println(" ");
        }
    }

}
