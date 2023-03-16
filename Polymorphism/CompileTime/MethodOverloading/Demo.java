class Demo
{
	void m1()
	{
		System.out.println("Inside m1 method 0 argm");
	}
	void m1(int a)
	{
		System.out.println("Inside m1 method 1 argm");
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo d= new Demo();
		d.m1();
		d.m1(10);
		System.out.println("Stop");
	}

}