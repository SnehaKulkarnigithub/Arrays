class Swap
{
	public static void main(String[] args)
	{
		int a=100, b=200, temp;
		System.out.println("Before a is:"+a);
		System.out.println("Before b is:"+b);
		temp=b;
		b=a;
		a=temp;
		System.out.println("After a is:"+a);
		System.out.println("After b is:"+b);
	}

}