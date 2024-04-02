package exceptionhandling.bank;

import java.util.Scanner;

class SelectChoice{
    private Bank bank;
    void getChoice()  {
        Scanner sc=new Scanner(System.in);
        bank=new Bank(123123,5000);
        System.out.println("Enter the pin: ");
        int pin=sc.nextInt();
        if(bank.pinNumber==pin) {
            while (true) {
                System.out.println("Enter the choice: ");
                System.out.println("1. Balance\n2. deposit\n3. withdraw\n4. Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        bank.getBalance();
                        System.out.println(bank.getBalance());
                        break;
                    case 2:
                        new Transaction().depositAmount(bank);
                        break;
                    case 3:
                        new Transaction().withdraw(bank);
                        break;
                    case 4:
                        System.out.println("--Thank You----");
                        return;
                    default:
                        System.out.println("Please Enter Valid Choice");
                }
            }
        }
        else {
            System.out.println("Please Enter valid pin");
            getChoice();
        }
    }
}
public class BankTransaction {
    public static void main(String[] args)  {
        SelectChoice selectChoice=new SelectChoice();
        selectChoice.getChoice();
    }
}
