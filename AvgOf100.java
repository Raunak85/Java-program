package com.Raunak;
import java.util.Scanner;
public class AvgOf100 {
    public static void main(String[] args) {
        System.out.println("how many number of average do you want ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0,input,avg;
        System.out.println("\t enter number till "+num+" time ");
        for(int i=1;i<=num;i++)
        {
            if(num>100)
            {
                System.out.println("you are entering out of limit plz enter 100 ");
            }
            else{
                System.out.println("enter the "+i+"  number ");
                input=sc.nextInt();
                sum=sum+input;
            }
        }
        avg=sum/num;
        System.out.println("the average is =  "+avg);
    }
}
