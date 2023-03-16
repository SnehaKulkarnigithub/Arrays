class Sample
{
	interface It1
	{
		void m1();
	}
}
class Demo8 implements Sample.It1
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}

	public static void main(String[] args)
	{
		Demo8 d=new Demo8();
		d.m1();
	}
}