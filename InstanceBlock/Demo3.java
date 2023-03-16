class Demo3
{
	int a;
	{
		
		System.out.println("Inside Instance Block");
		System.out.println(a);
		a=10;
	}
	Demo3()
	{
		System.out.println("Inside 0 argm const");
		System.out.println(a);
		a=100;
	}

	void m1()
	{
		System.out.println("Inside m1 method");
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo3 d=new Demo3();
		d.m1();
		System.out.println("Stop");
	}
}