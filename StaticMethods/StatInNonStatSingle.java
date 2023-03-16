class StatInNonStatSingle
{
	static boolean x=true;
	public static void main(String[] args)
	{
		System.out.println("Start");
		StatInNonStatSingle d=new StatInNonStatSingle();
		d.m1();
		System.out.println("Stop");
	}
	void m1()
	{
		//Direct
		System.out.println(x);
		m2();
		//Class Name
		System.out.println(StatInNonStatSingle.x);
		StatInNonStatSingle.m2();
		//Object
		StatInNonStatSingle d1=new StatInNonStatSingle();
		System.out.println(d1.x);
		d1.m2();
	}

	static void m2()
	{
		System.out.println("Inside m2 Method");
	}
}