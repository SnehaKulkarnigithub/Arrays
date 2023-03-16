class Demo
{
	static float b=200.5f;

	static void test()
	{
		System.out.println("Inside Method test");
	}
}
class StatInStat
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		// class Name
		System.out.println(Demo.b);
		Demo.test();
		//object
		Demo d=new Demo();
		System.out.println(d.b);
		d.test();
		System.out.println("stop");
	}

}