interface InterfaceOne
{
	void m1();
	void m2();
}
class ClassOne
{
	InterfaceOne io=new InterfaceOne()
	{
		public void m1()
		{
			System.out.println("Inside m1 method");
		}
		public void m2()
		{
			System.out.println("Inside m1 method");
		}
	};
}
class Sample3
{
	public static void main(String[] args)
	{
		ClassOne co=new ClassOne();
		co.io.m1();
		co.io.m2();
	}
}