class NonStatInStat
{
	float a=200.5f;

	static void test()
	{
		System.out.println("Inside Method test");
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		//Object
		NonStatInStat d= new NonStatInStat();
		System.out.println(d.a);
		d.test();
		System.out.println("Stop");

	}
}