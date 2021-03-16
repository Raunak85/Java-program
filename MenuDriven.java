import java.util.Scanner;
public class MenuDriven{
    public static void main(String[] args) {
        int i=1,fact=1,temp=0;
        String bear = "\ud83d\udc3b";
        System.out.println("enter any number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("________________________");
        System.out.println("1. Even or Odd\n2. positive or negative\n3. Factorial \n4. prime or not\n5. Exit");
        System.out.println("***********Enter your choice***********");
        byte choice = sc.nextByte();
        switch (choice)
        {
            case 1:
                if(num%2==0)
                {
                    System.out.println(num+" : is Even number");
                }
                else
                {
                    System.out.println(num+" : is Odd number");
                }
                break;
            case 2:
                if (num>0)
                {
                    System.out.println(num+" : is a positive number");
                }
                else
                {
                    System.out.println(num+" : is negative number");
                }
                break;
            case 3:
                while (i<=num)
                {
                    fact = fact*i;
                    i++;
                }
                System.out.println("Factorial of "+num+" is  = "+fact);
                break;
            case 4:
                for(int j=2;j<num;j++)
                {
                    if (num%j==0)
                    {
                        temp++;
                        break;
                    }
                }
                if(temp==0)
                {
                    System.out.println(num+" : is a prime number");
                }
                else
                {
                    System.out.println(num+" : is not prime number");
                }
            case 5:
                System.out.println("******"+bear+"*******");
                break;
            default:
                System.out.println("Error ! choice is not matched");
                break;

        }
    }
}
