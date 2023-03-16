interface It5
{
	void m1();
	void m2();
}
interface It55
{
	void m3();
	void m2();
}
class Demo5 implements It5,It55
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public void m2()
	{
		System.out.println("Inside m2 method");
	}
	public void m3()
	{
		System.out.println("Inside m3 method");
	}

	public static void main(String[] args)
	{
		Demo5 d=new Demo5();
		d.m1();
		d.m2();
		d.m3();
		d.m2();
	}
}