abstract class ClassOne
{
	abstract void m1();
	abstract void m2();
}
class ClassTwo
{
	ClassOne co=new ClassOne()
	{
		void m1()
		{
			System.out.println("Inside m1 method");
		}
		void m2()
		{
			System.out.println("Inside m1 method");
		}
	};
}
class Sample2
{
	public static void main(String[] args)
	{
		ClassTwo ct=new ClassTwo();
		ct.co.m1();
		ct.co.m2();
	}
}