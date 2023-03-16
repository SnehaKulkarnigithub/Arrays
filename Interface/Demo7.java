interface It7
{
	interface It77
	{
		void m1();
	}
}
class Demo7 implements It7.It77
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}

	public static void main(String[] args)
	{
		Demo7 d=new Demo7();
		d.m1();
	}
}