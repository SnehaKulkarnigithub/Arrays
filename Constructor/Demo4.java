class Demo4
{
	int a;
	static float b;

	Demo4(int a, float b)
	{
		System.out.println("Inside Constructor");
		this.a=a;
		this.b=b;
	}

	void m1()
	{
		System.out.println(a+Demo4.b);
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo4 d=new Demo4(100, 200.5f);
		d.m1();
		System.out.println("Stop");
	}
}