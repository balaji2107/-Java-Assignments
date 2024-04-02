package exceptionhandling.bank;
public class Bank {
    int pinNumber=2002;
    int accountNumber;
    double balance;
    public Bank(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }

}
