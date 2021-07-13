// linear search
package com.Raunak;

import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        int temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Element in Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Element are :");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nwhich element do you want to search");
        int search = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == search) {
                System.out.printf("Element present at   %d  position",i+1);
                temp++;
                break;
            }
        }
        if (temp==0)
        {
            System.out.println("Element Not found in list");
        }
    }
}
