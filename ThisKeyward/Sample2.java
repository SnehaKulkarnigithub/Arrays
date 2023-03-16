class Sample2
{
	int a=100;
	static int b=200;
	/*{
		System.out.println("Inside Instance Block");
		Sample2 s1=new Sample2();
		System.out.println(a);
	} */
	/* Sample2()
	{
		System.out.println("Inside Constuctor");
	} */
	static
	{
		System.out.println("Inside Static Block");
		Sample2 s2=new Sample2();
		System.out.println(s2.a);
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		System.out.println("Stop");
	}
}