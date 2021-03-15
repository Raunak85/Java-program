package com.Raunak;

public class PatternOfStar {
    public static void main(String[] args) {
        System.out.println("here pattern of star");
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
