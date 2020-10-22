package Kathi;

public class BankAccount {

    private int accountBalance;
    private int addMoney;
    private int withdrawMoney;

    public BankAccount(int accountBalance, int addMoney, int withdrawMoney){
        this.accountBalance = accountBalance;
        this.addMoney = addMoney;
        this.withdrawMoney = withdrawMoney;
    }

    public BankAccount(){

    }

    public void setBalance(){
        this.accountBalance = accountBalance;
    }

    public Integer getBalance(){
        return this.accountBalance;
    }

    public void setAdd(){
        this.addMoney = addMoney;
    }

    public Integer getAdd(){
        return this.addMoney;
    }

    public void setWithdraw(){
        this.withdrawMoney = withdrawMoney;
    }

    public Integer getWithdraw(){
        return this.withdrawMoney;
    }
}
