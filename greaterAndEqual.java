import java.util.Scanner;
class greaterAndEqual
{
 public  static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number :");
        int a= sc.nextInt();
	System.out.print("enter second number :");
        int b= sc.nextInt();
	System.out.print("enter third number :");
        int c= sc.nextInt();
        if (a>b && a>c)
        {
            if (b==c && a>c)
            {
                System.out.println("b and c are equal and a is greater");
            }
            else
            {
                System.out.println(" a is greater number ");
            }
        }
        else if (b>c && b>a)
        {
            if (a==c)
            {
                System.out.println("a and c are equal B is greater");
            }
            else
            {
                System.out.println("b is greater number");
            }
        }
        else if (c>a && c>b)
        {
            if (a==b)
            {
                System.out.println("a and b are equal and C is greater");
            }
            else
            {
                System.out.println("c is greater number");
            }
        }
        else
        {
            if (a==b && c<a)
            {
                System.out.println("a and b are equal and C is smallest");
            }
            else if (b==c && a<b)
            {
                System.out.println("b and c are equal A is smallest");
            }
            else if (c==a && b<c)
            {
                System.out.println("a and c are equal B is smallest");
            }
            else
            {
                System.out.println("all number are equal");
            }
        }

    }
}