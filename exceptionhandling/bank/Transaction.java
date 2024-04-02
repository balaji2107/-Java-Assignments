package exceptionhandling.bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Transaction {
    public void depositAmount(Bank bank){
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the Deposite Amount: ");
            double deAmount = sc.nextDouble();
            bank.balance=bank.getBalance()+deAmount;
            System.out.println(bank.getBalance());
        }
        catch (InputMismatchException e){
            System.out.println("Please Enter valid input");
            depositAmount(bank);
        }
    }
    public void withdraw(Bank bank)  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Withdraw Amount: ");
        double wAmount = sc.nextDouble();

        if (bank.getBalance() >= wAmount) {
            bank.balance = bank.getBalance() - wAmount;
            System.out.println("Withdrawal successful. Current balance: " + bank.getBalance());
        } else {
            try {
                throw new InsufficientBalanceException("Insufficient balance. Cannot withdraw");
            }
            catch (InsufficientBalanceException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}