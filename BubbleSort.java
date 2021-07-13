package com.Raunak;
import java.util.*; // i have import class for take input from user
public class BubbleSort {
    public static void main(String[] args) {
        int i,j,temp;
        Scanner sc=new Scanner(System.in);   // i have create scanner class object
        System.out.println("how many Numbers you wants bubble sorted :");
        int n=sc.nextInt();  // i have created one method of Scanner class for only accept integer number from user
        System.out.println("Enter elements : ");
        int[] num =new int[n]; // created array of int data type to store elements in num array variable
        for (i=0;i<n;i++)     //
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Element are ");
        for (i=0;i<n;i++)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println("\nElement in sorting order");
        for (i=0;i<n;i++)
        {
            for (j=0;j<n-i-1;j++)
            {
                if (num[j]>num[j+1])
                {
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        for (i=0;i<n;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}
