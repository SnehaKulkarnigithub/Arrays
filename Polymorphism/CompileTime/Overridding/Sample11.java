class A
{
	//static int a=20;
	static void m1()
	{
		System.out.println("Inside m1 method A");
	}
}
class B extends A
{
	//static float b=20.5f;
	static void m1()
	{
		System.out.println("Inside m1 method B");
	}
}
class Sample11
{
	public static void main(String[] args)
	{
		A a1=new B();
		a1.m1();
		//System.out.println(a1.a);
		//System.out.println(a1.b);
	}
}