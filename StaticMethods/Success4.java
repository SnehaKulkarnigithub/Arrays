class Sample
{
static Success4 s;
}
class Success4
{
	int a=100;
	public static void main(String[] args)
	{
		System.out.println("Start");
		Sample.s=new Success4();
		Sample.s.m1(Sample.s);// passed by reference
		System.out.println("Stop");
	}

	void m1(Success4 refvar)
	{
		System.out.println("Inside m1");
		//Access a
		System.out.println(refvar.a);
		//Access m2()
		refvar.m2();
	}
	void m2()
	{
		System.out.println("Inside m2");
	}
}