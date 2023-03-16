interface It2
{
	void m1();
	void m2();
	void m3();
}
class Demo2 implements It2
{
	public void m1()
	{
		System.out.println("Inside m1 method Demo2");
	}
	public void m2()
	{
		System.out.println("Inside m2 method Demo2");
	}
	public void m3()
	{
		System.out.println("Inside m3 method Demo2");
	}
	public static void main(String[] args)
	{
		It2 ii=new Demo2();
		ii.m1(); 
		ii.m2();
		ii.m3();
	}
}