class Demo8
{
	static boolean a=true;
	static void m1()
	{
		System.out.println("Inside m1");
		System.out.println(Demo8.a);
	}
	static void m2()
	{
		System.out.println("Inside m2");
		System.out.println(Demo8.a);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo8.m1();
		Demo8.m2();
		System.out.println("Stop");
	}
}