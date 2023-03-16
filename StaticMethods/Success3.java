class Demo
{
	static Success3 s;
}
class Success3
{
	int a=500;
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo.s= new Success3();
		System.out.println(Demo.s.a);
		Demo.s.m1();
		System.out.println("Stop");
	}

	void m1()
	{
		System.out.println("Inside m1 Method");
	}
}