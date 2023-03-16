abstract class Sample1
{
	abstract void m1();
}
abstract class Sample2 extends Sample1
{
	abstract void m2();
}
class Demo3 extends Sample2
{
	void m1()
	{
		System.out.println("Inside m1 method Demo3");
	}
	void m2()
	{
		System.out.println("Inside m2 method Demo3");
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		Sample2 s1=new Demo3();   //Upcasting
		s1.m1();
		s1.m2();
		System.out.println("---------------------------------");
		Demo3 d1=new Demo3();    //Simple Inheritance
		d1.m1();
		d1.m2();
		System.out.println("Stop");
	}
}