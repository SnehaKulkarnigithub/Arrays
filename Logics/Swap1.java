class Swap1
{
	public static void main(String[] args)
	{
		int a=100, b=200;
		System.out.println("Before a is:"+a);
		System.out.println("Before b is:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After a is:"+a);
		System.out.println("After b is:"+b);
	}
}