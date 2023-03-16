class Demo8
{
	Demo8()
	{
		System.out.println("Inside 0 argm const");
	}
	Demo8(int a)
	{
		System.out.println("Inside 1 argm const");
	}
	void m1()
	{
		System.out.println("Inside m1 0 argm");
	}
	void m1(float y)
	{
		System.out.println("Inside m1 1argm");
	}
	public static void main(String[] args)
	{
		new Demo8().m1(20.5f);
		new Demo8(10).m1();
	}
}