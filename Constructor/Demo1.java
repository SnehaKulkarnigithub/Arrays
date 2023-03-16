class Demo1
{
	int a;  float b;
	Demo1()
		{
			System.out.println("Inside Constructor");
			a=10;
			b=20.5f;
		}

	void m1()
	{
		a=100;  b=200.f;
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo1 d=new Demo1();
		System.out.println(d.a);
		System.out.println(d.b);
		d.m1();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println("Stop");
	}


}