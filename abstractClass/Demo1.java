abstract class Sample
{
	abstract void m1();
}
class Demo1 extends Sample
{
	void m1()
	{
		System.out.println("Inside m1 method Demo1");
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		Sample s1=new Demo1();
		s1.m1();
		System.out.println("Stop");
	}
}