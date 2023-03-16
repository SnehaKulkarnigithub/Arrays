class Outer2
{
	int a=100;
	static float b=200.5f;
	static class Inner2
	{
		static void m1()
		{
			System.out.println("Inside m1 method");
			System.out.println(new Outer2().a + b);
		}
	}
}

class Sample2
{
	public static void main(String[] args)
	{
		Outer2.Inner2.m1();
	}
}