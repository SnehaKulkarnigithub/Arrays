class ReturnBValue
{
	static int a;
	public static void main(String[] args)
	{
		System.out.println("Start");
		a=m1();
		System.out.println(a);
		System.out.println("Stop");
	}
	static int m1()
	{
		System.out.println("Inside m1");
		int b=200;
		return b;
	}
}