package com.Raunak;

// write a program to print the following pattern;
//          1
//          21
//          321
//          4321
//          54321
public class PatternOfReverseNumber {
    public static void main(String[] args) {
        System.out.println("Here is pattern in reverse number");
        for (int i=1;i<=5;i++)
        {
            for (int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
