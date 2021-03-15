import java.util.*;
class febonacciSeries
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many febonacci series do you want");
		int num=sc.nextInt();
		int a=0,b=1,sum;
		System.out.println("febonacci series of "+num+" is");
		System.out.print(a+" " +b);
		for(int i=2;i<num;i++)
		{
			sum=a+b;
			
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}
	}


}