package com.Raunak;
import java.util.Scanner;
public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        System.out.println("enter first number ");
        Scanner sc=new Scanner(System.in);
        double number1=sc.nextDouble();
        System.out.println("enter an operator (+ , - , * , / )");
        char operator=sc.next().charAt(0);
        System.out.println("enter second number ");
        double number2= sc.nextDouble();
        double result;
        switch (operator)
        {
            case '+':
                result = number1+number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Error ! operator is not correct ");
                return;
        }
        System.out.println(number1 + " " + operator + " " + number2 + " = " + result );
    }
}
