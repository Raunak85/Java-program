import java.util.Scanner;
class PrimeNumber
{
	public static void main(String args[])
	{
		System.out.println("enter any number ");
		Scanner prime=new Scanner(System.in);
		
		int number=prime.nextInt();
		int temp=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				temp=temp+i;
			}
		}
		if(temp==0)
		{
			System.out.println(number + " is prime number ");
			
		}
		else
		{
			System.out.println(number + " is not prime number");
		}
	}




}