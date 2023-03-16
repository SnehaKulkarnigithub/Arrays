abstract class ClassOne
{
	abstract void m1();
	abstract void m2();
}
class ClassTwo extends ClassOne
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
	void m2()
	{
		System.out.println("Inisde m2 method");
	}
}
class Sample1
{
	public static void main(String[] args)
	{
		ClassTwo ct=new ClassTwo();
		ct.m1();
		ct.m2();
	}
}