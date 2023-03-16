class Success7
{
	Success7 refvar;
	void m1()
	{
		System.out.println("Inside m1 method");
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		m2();
		m3();
		System.out.println("Stop");
	}

	static void m2()
	{
		System.out.println("Inside m2 method");
		Success7 s=new Success7();
		s.refvar=new Success7();
		s.refvar.m1();
	}
	static void m3()
	{
		System.out.println("Inside m3 method");
		Success7 s1=new Success7();
		s1.refvar=new Success7();
		s1.refvar.m1();
	}
}