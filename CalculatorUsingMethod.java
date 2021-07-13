package com.Raunak;
import java.util.Scanner;
class calculator{
    void addition(float a,float b)
    {
        System.out.println("----------------------------");
        System.out.println(a+"+"+b +"=" +(a+b));
        System.out.println("----------------------------");
    }
    void subtraction(float a,float b)
    {
        System.out.println("----------------------------");
        System.out.println(a+"-"+b +"=" +(a-b));
        System.out.println("----------------------------");
    }
    void multiplication(float a,float b){
        System.out.println("----------------------------");
        System.out.println(a+" * "+b +"=" +(a*b));
        System.out.println("----------------------------");
    }
    void division(float a,float b){
        System.out.println("----------------------------");
        System.out.println(a+"/"+b +"="+ (a/b));
        System.out.println("----------------------------");
    }
}
public class CalculatorUsingMethod {
    public static void main(String[] args) {
        calculator cal=new calculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        float a=sc.nextInt();
        System.out.println("enter Second number");
        float b=sc.nextInt();
        while (true)
        {
            System.out.println("-----------------------------------");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            System.out.println("-----------------------------------");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch (choice) {
                case 1 -> cal.addition(a, b);
                case 2 -> cal.subtraction(a, b);
                case 3 -> cal.multiplication(a, b);
                case 4 -> cal.division(a, b);
                case 5 -> System.exit(0);
                default -> System.out.println("Error ! choice is not found");
            }
        }

    }
}
