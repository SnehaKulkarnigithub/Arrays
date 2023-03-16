class Success1
{
	static Success1 refvar;
	public static void main(String[] args)
	{
		System.out.println("Start");
		Success1.refvar =new Success1();
		Success1.refvar.m1();
		System.out.println("Stop");
	}

	void m1()
	{
		System.out.println("Inside m1 method");
	}
}