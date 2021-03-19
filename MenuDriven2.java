package com.Raunak;
import java.util.*;
public class MenuDriven2 {
    public static void main(String[] args) {
//        float pie=3.14f;
//        int choice;
        double result;
        Scanner sc=new Scanner(System.in);
            System.out.println("**********Welcome to Menu Driven code*************");
        while (true)
        {
            System.out.println("****what task do you want to do****");
            System.out.println("1 - Area of Circle\n2 - Area of Triangle \n3 - Area of Square\n4 - Area of Rectangle\n5 - Exit ");
            System.out.println("---------enter your choice---------- ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:// this case for area of circle
                    float pie = 3.14f;// value of pie
                    System.out.println("enter radius of Circle");
                    int r = sc.nextInt();                       // user enter radius value of integer data type
                    result = pie * r * r;                       // store value of area of circle in result
                    System.out.println("Area of Circle is =  "+result); // Display value of result

                    System.out.println("---------------------------------------");
                    break;
                case 2: // this case for area of triangle
                    System.out.println("enter base of triangle");
                    double b = sc.nextDouble();                         // user enter base value of triangle
                    System.out.println("enter height of triangle");
                    double h = sc.nextDouble();
                    result = (h * b) / 2;                     // here store data of area of triangle
                    System.out.println("Area of triangle is = " + result);       // display value of result;
                    System.out.println("---------------------------------------");
                    break;                          // it used for come out the switch statement ;
                case 3:
                    System.out.println("enter value of side of area");
                    double a = sc.nextDouble();
                    result = a * a;
                    System.out.println("the area of square is = " + result);
                    System.out.println("---------------------------------------");
                    break;
                case 4:                             // this case for area of rectangle;
                    System.out.println("enter  length of rectangle");
                    double l = sc.nextDouble();
                    System.out.println("enter width of rectangle");
                    double w = sc.nextDouble();
                    result = w * l;
                    System.out.println("Area of Rectangle is = " + result);
                    System.out.println("---------------------------------------");
                    break;
                case 5:
                    System.exit(0);

                default:
                    System.out.println("Error ! choice is not matched");
                    System.out.println("---------------------------------------");
                    break;
            }
        }
    }
}
