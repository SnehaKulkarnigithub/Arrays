class Sample
{
	static int a=100;
	static boolean b=true;
	void m1(int a, boolean b)
	{
		System.out.println("Inside Method m1");
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(a);
		System.out.println(b);
	}
	Sample()
	{
		System.out.println("inside o Arg Const");
	}
	Sample(int a, float b)
	{
		this();
		System.out.println("Inside 2 Arg const");
		float c=a+b;
		System.out.println(c);
		System.out.println(this.a);
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		Sample s=new Sample(500, 100.5f);
		s.m1(200, false);
		System.out.println("Stop");
	}
}
