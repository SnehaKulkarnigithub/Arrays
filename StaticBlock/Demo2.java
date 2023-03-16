class Demo2
{
	static int a;
	static
	{
		System.out.println("Inside static Block" +a);
		a=10;
	}
	static void m1()
	{
		System.out.println("Inside m1 method" + a);
	}
	public static void main(String[] args)
	{
		System.out.println("Inside main");
		Demo2.m1();
	}
}