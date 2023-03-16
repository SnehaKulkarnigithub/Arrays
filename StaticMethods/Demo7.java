class Demo7
{
	static float b=200.5f;
	public static void main(String[] args)
	{
		System.out.println("Start");
		int a=100;
		Demo7.m1(a);
		System.out.println("Stop");
	}
	static void m1(int a)
	{
		System.out.println("Inside m1");
		float result=a+Demo7.b;
		System.out.println(result);
	}
}