class HomeWork
{
	int a;
	static float b;

	static
	{
		System.out.println("Inside Static Block");
	}

	{
		System.out.println("Inside Instance Block");
	}

	HomeWork()
	{
		this(20,200.5f);
		System.out.println("Inside constructor 0 args");
	}
	HomeWork(int a, float b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Inside 2 argm const");
		System.out.println(this.a);
		System.out.println(this.b);
	}

	void m1()
	{
		System.out.println("Inside m1 method");
		m2();
	}

	static void m2()
	{
		System.out.println("Inside m2 method");
	}

	public static void main(String[] args)
	{
		System.out.println("Inside Main");
		HomeWork h=new HomeWork();
		h.m1();
	}
}