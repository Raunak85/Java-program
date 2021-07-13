package com.Raunak;
import java.util.Scanner;
public class DiagonalMatrix {
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("enter array elements");
        for (i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("elements of array are = ");
        for (i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("the diagonal matrix = ");
        for (i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
                if (i==j)
                {
                    System.out.print(arr[i][j] +" ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }
    }
}
