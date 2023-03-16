class DisplayInMethod
{
	static int a=100;
	public static void main(String[] args)
	{
		System.out.println("Start");
		float b=300.5f;
		m1(b);
		System.out.println("Stop");
	}

	static void m1(float b)
	{
		System.out.println("Inside m1");
		float result=a+b;
		System.out.println(result);
	}
}