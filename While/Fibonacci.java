class Fibonacci
{
	public static void main(String[] args)
	{
		int a=0, b=1, c=0, num=20;

		for (int i=1 ;i<=num ;i++ )
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(" the fibonacci of "+num+" is "+c);
		
		
	}
}