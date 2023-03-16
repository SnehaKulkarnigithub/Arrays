class Demo2
{
	void m1(int a)
	{
		System.out.println("Inside method m1 int");
	}
	void m1(float x, char y)
	{
		System.out.println("Inside method m1 float and char");
	}
	void m1(boolean z)
	{
		System.out.println("Inside method m1 boolean");
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo2 d2=new Demo2();
		d2.m1(20.5f,'x');
		System.out.println("Start");
	}
}