abstract class Sample1
{
	abstract void m1();
}
abstract class Sample2 extends Sample1
{
	void m2()
	{
		System.out.println("Inside m2 method Sample2");
	}
}
abstract class Sample3 extends Sample2
{
	abstract void m2();
}
class Demo4 extends Sample3
{
	void m1()
	{
		System.out.println("Inside m1 method Demo4");
	}
	void m2()
	{
		System.out.println("Inside m2 method Demo4");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Sample2 s3=new Demo4();//Upcasting
		s3.m1();
		s3.m2();
		System.out.println("Stop");
	}
}