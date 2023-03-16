class Success2
{
	int a=100;
	public static void main(String[] args)
	{
		System.out.println("Start");
		Success2 refvar=new Success2();
		System.out.println(refvar.a);
		Success2.m1(refvar);  //pass by reference
		System.out.println("Stop");
	}

	static void m1(Success2 retval)
	{
		System.out.println("Inside m1 " + retval.a);
	}
}