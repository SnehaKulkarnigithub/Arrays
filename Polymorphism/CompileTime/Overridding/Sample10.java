class A
{
	void m1()
	{
		System.out.println("Inside m1 method A");
	}
}
class B extends A 
{
	void m1()
	{
		System.out.println("Inside m1 method B");
	}
}
class Sample10
{
	public static void main(String[] args)
	{
		A a=new B();
		a.m1();
	}
}