class ClassOne
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class Demo extends ClassOne
{
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class ClassTwo
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo d=new Demo();
		d.m1();
		d.m2();
		System.out.println("Stop");
	}
	
}