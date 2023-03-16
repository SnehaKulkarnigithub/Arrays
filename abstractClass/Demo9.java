abstract class Sample1
{
	Sample1()
	{
		System.out.println("Inside constructor Sample1");
	}
	abstract void m1();
	void m2()
	{
		System.out.println("Inside m2 method Sample1");
	}
}
class Demo9 extends Sample1
{
	void m1()
	{
		System.out.println("Inside m1 method Demo9");
	}
	void m3()
	{
		System.out.println("Inside m3 method Demo9");
		this.m1();
		super.m2();
	}
	public static void main(String[] args)
	{
		Demo9 s=new Demo9();
		s.m3();
	}
}