package com.armstrong;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("enter number for armstrong ");
        Scanner sc=new Scanner (System.in);
        int num = sc.nextInt();
        int t = num, len = 0;
        while (t!=0)
        {
            len = len+1;
            t = t/10;

        }
        int t2=num,rem,arm=0;
        while (t2!=0)
        {
            rem = t2%10;
            int mul=1;
            for(int i=1;i<=len;i++)
            {
                mul = mul*rem;
            }
            arm = arm+mul;
            t2=t2/10;
        }
        if (num==arm) {
            System.out.println( num + " : is a armstrong number ");
        }
        else {
            System.out.println(num +" : is not armstrong number ");
        }

    }
}
