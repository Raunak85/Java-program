import java.util.Scanner;
class Factorial
{
	public static void main(String arg[])
	{
		System.out.println("enter any number ");
		Scanner z=new Scanner(System.in);
		int number=z.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++)
			{
				fact=fact*i;	
			}
		System.out.println("factorial of "+number+" is " +fact);
		
	}
}