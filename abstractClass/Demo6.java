abstract class Sample1
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}
abstract class Sample2 extends Sample1
{
	void m1()
	{
		System.out.println("Inside m1 method Sample2");
	}
}
abstract class Sample3 extends Sample2
{
	void m2()
	{
		System.out.println("Inside m2 method Sample3");
	}
}
class Sample4 extends Sample3
{
	void m3()
	{
		System.out.println("Inside m3 method Sample4");
	}
}
class Demo6
{
	public static void main(String[] args)
	{
		Sample1 s=new Sample4();
		s.m1(); s.m2(); s.m3();
	}
}