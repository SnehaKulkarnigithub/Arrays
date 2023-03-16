class Success8
{
	Success8 refvar;
	void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Success8 s=new Success8();
		s.refvar=new Success8();
		Success8.m2(s.refvar);
		Success8.m3(s.refvar);
		System.out.println("Stop");
	}

	static void m2(Success8 s1)
	{
		System.out.println("Inside m2");
		s1.m1();
	}

	static void m3(Success8 s2)
	{
		System.out.println("Inside m3");
		s2.m1();
	}
}