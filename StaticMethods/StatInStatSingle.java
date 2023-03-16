class StatInStatSingle
{
	static int a=200;

	public static void main(String[] args)
	{
		System.out.println("Start");
		//Direct Accecss
		System.out.println(a);
		test();
		// class Name
		System.out.println(StatInStatSingle.a);
		StatInStatSingle.test();
		//object
		StatInStatSingle ss= new StatInStatSingle();
		System.out.println(ss.a);
		ss.test();
	}

	static void test()
	{
		System.out.println("Inside Method test");
	}
}