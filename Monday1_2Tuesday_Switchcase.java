package com.Raunak;
import java.util.Scanner;
public class Monday1_2Tuesday_Switchcase {
    public static void main(String[] args) {
        System.out.println("enter number between 1 to 7");
        Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
//        do{
//            if(num<=7 && num>=1){
//                break;
//            }
//            else {
//                System.out.println("Error! enter valid character between 1 to 7");
//            }
//        }while(num!=0);
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error! enter valid character");
                break;

        }
    }
}
