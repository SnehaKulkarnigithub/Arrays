class Outer2
{
	void m1()
	{
		System.out.println("Inside m1 method");
		class Inner2
		{
			int a=100;
		}
		Inner2 i2=new Inner2();
		System.out.println(i2.a);
	}
    void m2()
	{
		System.out.println("Inside m2 method");
		class Inner2
		{
			float b=200.5f;
		}
		Inner2 i2=new Inner2();
		System.out.println(i2.b);
	}
}

class Sample2
{
	public static void main(String[] args)
	{
		Outer2 o2=new Outer2();
		o2.m1();
		o2.m2();
	}
}