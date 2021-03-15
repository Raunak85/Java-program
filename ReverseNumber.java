package com.Raunak;
// write a program while loop to reverse the digits of no
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem,rev=0;
        while (num!=0)
        {
            rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.println("the reverse number is : "+rev);
    }
}
