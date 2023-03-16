interface It6
{
	void m1();
}
class cl1
{
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class Demo6 extends cl1 implements It6
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args)
	{
		Demo6 d=new Demo6();
		d.m1();
		d.m2();
	}
}