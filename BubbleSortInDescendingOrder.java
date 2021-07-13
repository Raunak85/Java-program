package com.Raunak;
import java.util.*;
public class BubbleSortInDescendingOrder {
    public static void main(String[] args) {
        int i,j,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("how many number do you want sorted");
        int n= sc.nextInt();
        System.out.println("enter elements :");
        int[] num =new int[10];
        for (i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Element are :");
        for (i=0;i<n;i++)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println("\nElements sorted in descending order :");
        for (i=0;i<n;i++)
        {
            for (j=0;j<n-i-1;j++)
            {
                if(num[j]<num[j+1])
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
