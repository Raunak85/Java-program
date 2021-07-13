package com.Raunak;
import java.util.Scanner;
class bank{
    Scanner sc=new Scanner(System.in);

    int account_number;
    String customer_name;
    int total_balance;

    bank()
    {
        System.out.println("Enter your Bank Account Number");
        account_number=sc.nextInt();
        System.out.println("Enter your Name");
        customer_name=sc.next();
        System.out.println("Enter total Bank Balance");
        total_balance=sc.nextInt();

    }
    void deposit()
    {
        int deposit;
        System.out.println("How much Amount do you want to Deposit");
        deposit=sc.nextInt();
        total_balance=total_balance+deposit;
        System.out.println("Total Amount = "+total_balance);
    }
    void withdraw()
    {
        int withdraw;
        System.out.println("Enter Withdraw Amount");
        withdraw=sc.nextInt();
        if (total_balance>withdraw)
        {
            System.out.println("********Withdraw successful********");
            total_balance=total_balance-withdraw;

        }
        else {
            System.out.println("Withdraw Not possible\n\t\t total amount = "+total_balance);
        }
    }
    void customerInformation()
    {
        System.out.println("Name = "+customer_name);
        System.out.println("Account number = "+account_number);
        System.out.println("Total Amount = "+total_balance);
    }
}
public class CustomerBankInformation {
    public static void main(String[] args) {
        bank b1=new bank();
        b1.deposit();
        b1.withdraw();
        b1.customerInformation();

        bank b2=new bank();
        b2.deposit();
        b2.withdraw();
        b2.customerInformation();
    }
}
