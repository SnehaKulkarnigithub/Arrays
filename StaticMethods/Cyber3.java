class Cyber3
{
	int a=300;

	public static void main(String[] args)
	{
		Cyber3 c1=new Cyber3();
		c1.m2();
	}

	void m1()
	{
		System.out.println("Inside Method m1");
	}

	void m2()
	{
		System.out.println("Inside Method m2");
		//Direct
		System.out.println(a);
		m1();
		//Object
		Cyber3 c2=new Cyber3();
		System.out.println(c2.a);
		c2.m1();
	}
}