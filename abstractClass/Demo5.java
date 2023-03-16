abstract class Sample1
{
	void m1()
	{
		System.out.println("Inside m1 method Sample1");
	}
}
class Demo5 extends Sample1
{
	public static void main(String [] args)
	{
		System.out.println("Start");
		Demo5 d=new Demo5();
		d.m1();
		System.out.println("Stop");
	}
}