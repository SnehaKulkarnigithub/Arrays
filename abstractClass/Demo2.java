abstract class Sample
{
	abstract void m1();
	void m2()
	{
		System.out.println("Inside m2 method Sample");
	}
}
class Demo2 extends Sample
{
	void m1()
	{
		System.out.println("Inside m1 method Demo2");
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		Sample s1=new Demo2();     //Upcasting
		s1.m1();
		s1.m2();
		System.out.println("---------------------------");
		Demo2 d1=new Demo2();
		d1.m1();
		d1.m2();
		System.out.println("Stop");
	}
}
