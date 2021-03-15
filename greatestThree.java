import java.util.Scanner;
class greatestThree
{
	public static void main(String[] args)
	{
		System.out.println("enter first number ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter second number ");
		int b=sc.nextInt();
		System.out.println("enter third number ");
		int c=sc.nextInt();
		if(a>b&&a>c)
		{
		
			System.out.println(a+" : is greatest number");
			
		}
		else if(b>a&&b>c)
		{
			System.out.println(b+" : is greatest number");
		}
		else if(c>a&&c>b)
		{
			System.out.println(c+" : is greatest number");
		}
		
		
		else
		{
			System.out.println("all numbers are number ");
		}
	}


}