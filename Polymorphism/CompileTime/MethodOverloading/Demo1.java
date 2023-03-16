class Demo1
{
	void m1(int x)
	{
		System.out.println("Inside method m1 int");
	}
	void m1(float y)
	{
		System.out.println("Inside method m1 float");
	}
	void m1(boolean z)
	{
		System.out.println("Inside method m1 boolean");
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo1 d1=new Demo1();
		d1.m1(100);
		d1.m1(200.5f);
		System.out.println("Stop");
	}
}