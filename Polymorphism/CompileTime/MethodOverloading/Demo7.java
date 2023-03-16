class Demo7
{
	Demo7()
	{
		System.out.println("Inside constructor 0 argm");
	}

	Demo7(int a, float b)
	{
		System.out.println("Inside constructor int and float argm");
	}
	Demo7(char x, boolean y)
	{
		System.out.println("Inside constructor char and boolean argm");
	}

	public static void main(String[] args)
	{
		Demo7 d1=new Demo7(10,20.5f);
	}
}