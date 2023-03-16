class Success6
{
	int a;
	Success6 refvar;
	public static void main(String[] args)
	{
		System.out.println("Start");
		Success6 s1=new Success6();
		System.out.println(s1.refvar);
		s1.refvar=new Success6();
		s1.refvar.a=100;
		System.out.println(s1.refvar.a);
		System.out.println(s1.a);
		System.out.println("Stop");
	}
}