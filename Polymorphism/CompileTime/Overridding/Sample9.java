class A
{
	void m1()
	{
		System.out.println("Inside m1 method A");
	}
	void m3()
	{
		System.out.println("Inside m3 method A");
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("Inside m2 method B");
	}
	void m3()
	{
		System.out.println("Inside m3 method B");
	}
}
class Sample9
{
	public static void main(String[] args)
	{
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		System.out.println("----------------------------------");
		A a1=new B();
		a1.m1();
		//a1.m2();
		a1.m3();
	}
}