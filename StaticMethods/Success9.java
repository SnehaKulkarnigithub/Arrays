class Demo
{
	Success9 refvar;
}
class Success9
{
	int a=100;
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo d=new Demo();
		d.refvar=new Success9();
		d.refvar.m1(d.refvar);
		System.out.println("Stop");
	}

	void m1(Success9 s1)
	{
		System.out.println("Inside m1");
		s1.m2(s1);
	}
	static void m2(Success9 s2)
	{
		System.out.println("Inside m2");
		System.out.println(s2.a);
	}

}