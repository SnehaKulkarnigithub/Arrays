class Sampl
{
static Success5 s;
}
class Success5
{
	int a=100;
	public static void main(String[] args)
	{
		System.out.println("Start");
		Sampl.s= new Success5();
		Sampl.s.m1();
		System.out.println("Stop");
	}
	void m1()
	{
		System.out.println("Inside m1");
		//Access a
		System.out.println(Sampl.s.a);
		//Access m2
		Sampl.s.m2();
	}
	void m2()
	{
		System.out.println("Inside m2");
	}
}