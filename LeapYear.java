package com.Raunak;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("enter any year ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%4==0 && num%100!=0 || num%400==0){
            System.out.println(num+" : is leap year");
        }
        else {
            System.out.println(num+" : is not leap year");
        }
    }
}
