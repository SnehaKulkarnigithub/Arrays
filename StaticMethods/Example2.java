class Example2
{
	int a=100;

	public static void main(String[] args)
	{
		System.out.println("Start");
		Example2 e2= new Example2();
		System.out.println(e2.a);
		e2.test();
		System.out.println("Stop");
	}

	void test()
	{
		System.out.println("Inside Method Test");
	}
}