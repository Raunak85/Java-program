// Binary search
package com.Raunak;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int i,j,search,mid,li,hi,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Number do you want to insert in array ");
        int size=sc.nextInt();
        System.out.println("Enter element in array ");
        int[] arr=new int[size];
        for (i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The all element are ");
        for (i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSorted element in Ascending order ");
        for (i=0;i<size;i++)
        {
            for (j=0;j<size-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nWhich element do you want to search please enter Here ");
        search=sc.nextInt();
        li=0;
        hi=arr.length-1;
        mid=(li+hi)/2;
        while (li<=hi)
        {
            if (arr[mid]==search)
            {
                System.out.println("the element present at "+mid+" index position");
                break;
            }
            else if (arr[mid]<search)
            {
                li=mid+1;
            }
            else
            {
                hi=mid-1;
            }
            mid=(li+hi)/2;
        }
    }
}
