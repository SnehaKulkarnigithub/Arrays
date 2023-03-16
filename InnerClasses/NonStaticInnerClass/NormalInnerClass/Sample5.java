class Outer6
{
	private int a=100;
	private float b=200.5f;
	void m1()
	{
		System.out.println("Inside m1 method");
		new Inner6().m2();
	}
	private class Inner6
	{
		void m2()
		{
			System.out.println("Inside m2 method");
			System.out.println(a+b);
		}
	}
}
class Sample5
{
	public static void main(String[] args)
	{
		new Outer6().m1();
	}
}