class PassByArgument
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int a=100;
		m1(a);
		System.out.println("Stop");
	}
	static void m1(int a)
	{
		System.out.println("Inside m1");
		System.out.println(a);
	}
}